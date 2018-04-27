package com.teamway.cms.zhaotest;

import com.teamway.cms.pgutils.PG;
import com.teamway.cms.pgutils.PGPojo;
import com.teamway.cms.pgutils.PGUtil;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

/////////
public class VideoContro {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int videoId = Integer.parseInt(VideoContro.getUrlValue("videoId"));
        final int udpPort = Integer.parseInt(VideoContro.getUrlValue("udpPort"));
        final int type = Integer.parseInt(VideoContro.getUrlValue("type"));
        int seqNum = Integer.parseInt(VideoContro.getUrlValue("seqNum"));
        final String startTime = VideoContro.getUrlValue("startTime");
        final String stopTime = VideoContro.getUrlValue("stopTime");
        final int scale = Integer.parseInt(VideoContro.getUrlValue("scale"));
        final String videoip = VideoContro.getUrlValue("videoip");
        final int sessionId1 = Integer.parseInt(VideoContro.getUrlValue("sessionId1"));
        final int sessionId2 = Integer.parseInt(VideoContro.getUrlValue("sessionId2"));
        final int videoport = Integer.parseInt(VideoContro.getUrlValue("videoport"));
        Socket s = new Socket(videoip, videoport);
        // 构建IO
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        PGPojo info = PGUtil.newInstancePGObject(1141, 0, seqNum, new byte[]{63},
                new Object[]{new PG.chaxunluxiang(videoId, type, startTime.getBytes(), stopTime.getBytes())});
        seqNum += 1;
        byte[] pg = PGUtil.pgObjectToByteArray(info);
        byte[] buff = new byte[pg.length + 32];
        byte[] array = new byte[32];
        final byte[] tem = VideoContro.getUrlValue("bianma").getBytes();
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
        is.close();
        os.close();
        s.close();
        //拆包
        int lens = 0;
        int totallength = 0;
        ArrayList<Long> list = new ArrayList<>();
        ArrayList<String> listname = new ArrayList<>();
        lens = (byteArray.length - 12) / 208;

        for (int i = 1; i <= lens; i++) {
            byte[] b = new byte[128];
            int srcpos = 208 * (lens - i) + 92;
            System.arraycopy(byteArray, srcpos, b, 0, 128);
            byte[] startime = new byte[32];
            System.arraycopy(byteArray, 208 * (lens - i) + 24, startime, 0, 32);
            byte[] stoptime = new byte[32];
            System.arraycopy(byteArray, 208 * (lens - i) + 56, stoptime, 0, 32);
             /*
             新创建连接
              */
            Socket socket = new Socket(videoip, videoport);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            PGPojo pgPojo = PGUtil.newInstancePGObject(1143, sessionId2, seqNum, new byte[]{64},
                    new Object[]{new PG.CPTYPE_STORAGEDATA(videoId, type, startime, stoptime, b, new byte[256], 1)});
            seqNum += 1;
            byte[] info2 = PGUtil.pgObjectToByteArray(pgPojo);
            /*
            添加32位编码
             */
            byte[] buff2 = new byte[info2.length + 32];
            byte[] array2 = new byte[32];
            final byte[] tem2 = VideoContro.getUrlValue("bianma").getBytes();
            System.arraycopy(tem2, 0, array2, 0, tem2.length);
            System.arraycopy(array2, 0, buff2, 0, array2.length);
            System.arraycopy(info2, 0, buff2, 32, info2.length);
            ByteArrayOutputStream byteoutSteam = new ByteArrayOutputStream();
            out.write(buff2);
            Thread.sleep(100);
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
            //读取url
            is.read(b2);
            final String url = new String(b2, "gb2312");
            System.out.println(url.trim());
            final String substring = url.substring(7, 21);
            final String ip2ip = VideoContro.ip2ip(substring);
            final long ip2Long = VideoContro.ip2Long(ip2ip);
            list.add(ip2Long);
            //读取文件名
            is.read(b);
            final String url2 = new String(b, "gb2312");
            listname.add(url2.trim());

        }
        /*
        UDPServer服务端
         */
        final InetAddress address = InetAddress.getLocalHost();
        int port = udpPort;
        /*
        创建一个新连接
         */
        final int rtspport = Integer.parseInt(VideoContro.getUrlValue("rtspport"));
        final String rtspip = VideoContro.getUrlValue("rtspip");
        for (int i = 0; i < list.size(); i++) {
            final DatagramSocket udpsocket = new DatagramSocket(port, address);
            System.out.println("第" + i + "次执行");
            Socket ss = new Socket(rtspip, rtspport);
            // 构建IO
            OutputStream out = ss.getOutputStream();
            InputStream in = ss.getInputStream();
            String s1 = "DESCRIBE " + "rtsp://" + rtspip + ":" + rtspport + "/" + list.get(i) + ":" + rtspport + "/" + listname.get(i) + " RTSP/1.0\r\n" +
                    "User-Agent:GDDWStation/1.0\r\n" +
                    "Accept:application/sdp\r\n" +
                    "CSeq:1\r\n";
            out.write(s1.getBytes());
            out.flush();

            String s2 = "SETUP " + "rtsp://" + rtspip + ":" + rtspport + "/" + list.get(i) + ":" + rtspport + "/" + listname.get(i) + " RTSP/1.0\r\n" +
                    "Transport:PGSP/AVP;unicast;destination=192.168.12.188;client_port=9405\r\n"
                    + "CSeq:2\r\n";
            out.write(s2.getBytes());
            out.flush();
            //接受rpu到主站的回复url,主要是拆包获取session
            final BufferedReader reader = new BufferedReader(new InputStreamReader(in, "GBK"));
            final StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            line = reader.readLine();
            int index = -1;
            while (line != null) {
                if (line.contains("Session")) {
                    stringBuffer.append(line);
                    line = reader.readLine();
                    break;
                }
                stringBuffer.append(line);
                line = reader.readLine();
            }
            index = stringBuffer.indexOf("9");
            final String sessionid = stringBuffer.substring(index - 14, index + 4);
            //找到session立即抓起来
            Map<String, String> map = new HashMap();
            map.put("sessionid", sessionid);
            String s3 = "PLAY " + "rtsp://" + rtspip + ":" + rtspport + "/" + list.get(i) + ":" + rtspport + "/" + listname.get(i) + " RTSP/1.0\r\n" +
                    "Range:clock=20121219T002440Z\r\n" +
                    "Scale:" + scale + "\r\n" +
                    "CSeq:3\r\n" +
                    map.get("sessionid") + "\r\n";
            out.write(s3.getBytes());
            out.flush();
            //建立udp接收数据//会话保活
            final UdpThread udp = new UdpThread(listname.get(i), udpsocket);
            final OPTIONSThread option = new OPTIONSThread(listname, rtspport, rtspip, list, i, out, scale, map, true);
            udp.start();
            option.start();
            //等待视频下载结束
            udp.join();
            //终止循环
            option.setB(false);
            System.out.println("执行到这里了");

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

    /*
    ip地址转换成long
     */
    public static final long ip2Long(final String ip) {

        final String[] ipNums = ip.split("\\.");
        return (Long.parseLong(ipNums[0]) << 24)
                + (Long.parseLong(ipNums[1]) << 16)
                + (Long.parseLong(ipNums[2]) << 8)
                + (Long.parseLong(ipNums[3]));
    }

    /*
    ip反转
     */
    public static String ip2ip(String ip) {
        final StringBuilder s = new StringBuilder(ip);
        final int i = ip.indexOf(".");
        String a = s.substring(0, i);
        String a1 = s.substring(i + 1);
        final int i1 = a1.indexOf(".");
        String b = a1.substring(0, i1);
        final String b1 = a1.substring(i1 + 1);
        final int i2 = b1.indexOf(".");
        final String c = b1.substring(0, i2);
        final String d = b1.substring(i2 + 1);
        return d + "." + c + "." + b + "." + a;
    }
}