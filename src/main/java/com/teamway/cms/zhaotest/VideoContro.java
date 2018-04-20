package com.teamway.cms.zhaotest;

import com.teamway.cms.pgutils.PG;
import com.teamway.cms.pgutils.PGPojo;
import com.teamway.cms.pgutils.PGUtil;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

public class VideoContro {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s = new Socket("192.168.12.32", 8998);
        // 构建IO
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        PGPojo info = PGUtil.newInstancePGObject(1441, 0, 0, new byte[]{63},
                new Object[]{new PG.chaxunluxiang(3, 1, "2018-04-19 08:08:08".getBytes(), "2018-04-19 09:08:08".getBytes())});
        byte[] bytes = PGUtil.pgObjectToByteArray(info);
        byte[] buff = new byte[bytes.length + 32];
        byte[] array = new byte[32];
        final byte[] bytes1 = "1040020050000001".getBytes();

        System.arraycopy(bytes1, 0, array, 0, bytes1.length);
        System.arraycopy(array, 0, buff, 0, array.length);
        System.arraycopy(bytes, 0, buff, 32, bytes.length);
        os.write(buff);
        Thread.sleep(1000);
        // 读取服务器返回的消息
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = is.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        byte[] byteArray = outSteam.toByteArray();
        //拆包
        final ArrayList<String> list = new ArrayList<>();
        int lens = (byteArray.length - 12) / 208;
        int totallength = byteArray.length - 12;

        for (int i = 1; i <= lens; i++) {
            byte[] b = new byte[128];
            System.arraycopy(byteArray, totallength - 80 * i - 128 * (i - 1), b, 0, 128);
            PGPojo pgPojo = PGUtil.newInstancePGObject(1143, 0, 0, new byte[64],
                    new Object[]{new PG.CPTYPE_STORAGEDATA(3, 1, "sd".getBytes(), "dsf".getBytes(), new byte[256], b, 1)});
            byte[] info2 = PGUtil.pgObjectToByteArray(pgPojo);
            os.write(info2);
            while ((len = is.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            byte[] by = outSteam.toByteArray();
            byte[] b2 = new byte[256];
            System.arraycopy(byteArray, by.length - 216, b2, 0, 256);
            byte[] temp = new byte[64];
            is.read(temp);
            final String url = new String(temp);
            list.add(url);
        }
        /*
        创建一个新的连接
         */
        Socket ss = new Socket("192.168.12.32", 8998);
        /*
        创建一个UDP连接
         */

        // 构建IO
        InputStream in = ss.getInputStream();
        OutputStream out = ss.getOutputStream();
        for (int i = 0; i < list.size(); i++) {
            final String newurl = list.get(i);
            byte[] data1 = (newurl + "User-Agent:GDDWStation/1.0Accept:application/sdpCSeq:1").getBytes();
            out.write(data1);
            out.flush();
            Thread.sleep(2000);
            byte[] data2 = (newurl + "Transport:PGSP/AVP;unicast;destination=192.168.10.101;client_port=9405CSeq:2").getBytes();
            out.write(data2);
            out.flush();
            Thread.sleep(2000);
            byte[] data3 = (newurl + "Range:clock=20121219T002440ZScale:1.0CSeq:3Session:13559105531869000763").getBytes();
            out.write(data3);
            out.flush();
            Thread.sleep(2000);
            byte[] data4 = (newurl + "Scale:0.5CSeq: 6Session：13559105531869000763").getBytes();
            out.write(data4);

            out.flush();
            Thread.sleep(2000);
            byte[] data5 = (newurl + "CSeq:7Session:13559105531869000763").getBytes();
            out.write(data5);
            out.flush();
            Thread.sleep(2000);
            byte[] data6 = (newurl + "User-Agent:GDDWStation/1.0Accept:application/sdpCSeq:1").getBytes();
            out.write(data6);
            out.flush();
            Thread.sleep(2000);
            byte[] data7 = (newurl + "User-Agent:GDDWStation/1.0Accept:application/sdpCSeq:1").getBytes();
            out.write(data7);
            out.flush();
            Thread.sleep(2000);
            byte[] data8 = (newurl + "User-Agent:GDDWStation/1.0Accept:application/sdpCSeq:1").getBytes();
            out.write(data8);
            out.flush();

        }

    }


    /*
    获取配置文件的内容
     */
    public String getUrlValue(String urlName) {
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
