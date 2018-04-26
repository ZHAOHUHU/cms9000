package com.teamway.cms.zhaotest;

import com.teamway.cms.pgutils.PG;
import com.teamway.cms.pgutils.PGPojo;
import com.teamway.cms.pgutils.PGUtil;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
/////////
public class VideoContro {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int videoId = Integer.parseInt(VideoContro.getUrlValue("videoId"));
        final int udpPort = Integer.parseInt(VideoContro.getUrlValue("udpPort"));
        final int type = Integer.parseInt(VideoContro.getUrlValue("type"));
        int seqNum = Integer.parseInt(VideoContro.getUrlValue("seqNum"));
        final String startTime = VideoContro.getUrlValue("startTime");
        final String stopTime = VideoContro.getUrlValue("stopTime");
        final String CSeq = VideoContro.getUrlValue("CSeq");
        final int sessionId1 = Integer.parseInt(VideoContro.getUrlValue("sessionId1"));
        final int sessionId2 = Integer.parseInt(VideoContro.getUrlValue("sessionId2"));
        Socket s = new Socket("192.168.12.32", 8998);
        // 构建IO
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        PGPojo info = PGUtil.newInstancePGObject(1141, 0, seqNum, new byte[]{63},
                new Object[]{new PG.chaxunluxiang(6, 0, startTime.getBytes(), stopTime.getBytes())});
        seqNum += 1;
        byte[] pg = PGUtil.pgObjectToByteArray(info);
        byte[] buff = new byte[pg.length + 32];
        byte[] array = new byte[32];
        final byte[] tem = "1040020050000001".getBytes();
        System.arraycopy(tem, 0, array, 0, tem.length);
        System.arraycopy(array, 0, buff, 0, array.length);
        System.arraycopy(pg, 0, buff, 32, pg.length);
        os.write(buff);
        Thread.sleep(1000);
        os.flush();
        s.shutdownOutput();
        // 读取服务器返回的消息
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }

        byte[] byteArray = outSteam.toByteArray();
        System.out.println(byteArray);
        is.close();
        os.close();
        s.close();
        //拆包
        int lens = 0;
        int totallength = 0;
        ArrayList<String> list = new ArrayList<>();
        lens = (byteArray.length - 12) / 208;

        for (int i = 1; i <= lens; i++) {
            byte[] b = new byte[128];
            int srcpos=208*(lens-1)+92;
            System.arraycopy(byteArray, srcpos, b, 0, 128);
            byte[] startime = new byte[32];
            System.arraycopy(byteArray, 208*(lens-1)+24, startime, 0, 32);
            byte[] stoptime = new byte[32];
            System.arraycopy(byteArray, 208*(lens-1)+56, stoptime, 0, 32);
             /*
             新创建连接
              */
            Socket socket = new Socket("192.168.12.32", 8998);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            PGPojo pgPojo = PGUtil.newInstancePGObject(1143, sessionId2, seqNum, new byte[]{64},
                    new Object[]{new PG.CPTYPE_STORAGEDATA(videoId, type, startime, stoptime,b,new byte[256], 1)});
            seqNum += 1;
            byte[] info2 = PGUtil.pgObjectToByteArray(pgPojo);
            /*
            添加32位编码
             */
            byte[] buff2 = new byte[info2.length + 32];
            byte[] array2 = new byte[32];
            final byte[] tem2 = "1040020050000001".getBytes();
            System.arraycopy(tem2, 0, array2, 0, tem2.length);
            System.arraycopy(array2, 0, buff2, 0, array2.length);
            System.arraycopy(info2, 0, buff2, 32, info2.length);
            ByteArrayOutputStream byteoutSteam = new ByteArrayOutputStream();
            out.write(buff2);
            Thread.sleep(1000);
            out.flush();
            socket.shutdownOutput();
            while ((len = in.read(buffer)) != -1) {
                byteoutSteam.write(buffer, 0, len);
            }
            byte[] by = byteoutSteam.toByteArray();
            //关闭连接
            in.close();
            out.close();
            socket.close();
            byte[] b2 = new byte[256];
            //返回固定长度476字节
            System.arraycopy(by, 216, b2, 0, 256);
            is.read(b2);
            final String url = new String(b2,"gb2312");
            System.out.println(url);
            list.add(url);
        }
        /*
        UDPServer服务端
         */
        final InetAddress address = InetAddress.getLocalHost();
        int port = udpPort;
        final DatagramSocket udpsocket = new DatagramSocket(port, address);
        /*
        创建一个新连接
         */
        Socket ss = new Socket("192.168.12.201", 554);
        // 构建IO
        OutputStream out = ss.getOutputStream();
        InputStream in = ss.getInputStream();
        for (int i = 0; i < list.size(); i++) {
            String s1 = "DESCRIBE " + list.get(i) + "RTSP/1.0\r\n" +
                    "User-Agent:GDDWStation/1.0\r\n" +
                    "Accept:application/sdp\r\n" +
                    "CSeq:" + CSeq;
            final PrintWriter writer = new PrintWriter(out);
            writer.write(s1);
            writer.flush();
            String s2 = "SETUP " + list.get(i) + "RTSP/1.0\r\n" +
                    "Transport:PGSP/AVP;unicast;destination=192.168.12.188;client_port=9405\r\n"
                    + "CSeq:" + 1;
            writer.write(s2);
            writer.flush();
            //接受rpu到主站的回复url,主要是拆包获取session
            final BufferedReader reader = new BufferedReader(new InputStreamReader(in, "GBK"));
            String data = null;
            while ((data = reader.readLine()) != null) {
                System.out.println("返回信息为" + data);
            }
            final StringBuilder builder = new StringBuilder(data);
            final String sessionid = builder.substring(data.length() - 28);

            String s3 = "PLAY " + list.get(i) + "RTSP/1.0\r\n" +
                    "Range:clock=20121219T002440Z\r\n" +
                    "Scale:1.0\r\n" +
                    "CSeq:" + CSeq + "\r\n" +
                    sessionid;
            writer.write(s3);
            writer.flush();
            //建立udp接收数据//会话保活
            final UdpThread udp = new UdpThread(":");
            final OPTIONSThread option = new OPTIONSThread(list, i, writer);
            udp.start();
            option.start();
            //关闭rtsp连接
            String s4 = "TEARDOWN " + list.get(i) + "RTSP/1.0\r\n" +
                    "Range:clock=20121219T002440Z\r\n" +
                    "Scale:1.0\r\n" +
                    "CSeq:4\r\n" +
                    sessionid;
            writer.write(s4);
            writer.flush();
        }
    }

    /*
    获取配置文件的内容 多添加一个倍数播放参数
     */
    public static String getUrlValue(String urlName) {
        String url = null;
        Properties prop = new Properties();
        try {
            ClassLoader classLoader = VideoContro.class.getClassLoader();// 读取属性文件xxxxx.properties
            InputStream in = classLoader.getResourceAsStream("video.properties");
            prop.load(in); /// 加载属性列表
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                if (it.next().equals(urlName)) {
                    url = prop.getProperty(urlName);
                }
            }
            in.close();
        } catch (Exception e) {
        }
        return url;
    }
}