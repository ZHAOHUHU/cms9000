package com.teamway.cms.zhaotest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class TestUdp {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.12.201", 554);
        final OutputStream out = s.getOutputStream();
        String s1 = "DESCRIBE rtsp://192.168.12.201:554/data/data01/2018-04-19/0/00:24:40.rec_0.mp4 RTSP/1.0\r\n" +
                "User-Agent:GDDWStation/1.0\r\n" +
                "Accept:application/sdp\r\n" +
                "CSeq:1";
        byte[] buf = s1.getBytes();
        out.write(buf);
        String s2 = "SETUP rtsp://192.168.12.201:554/data/data01/2018-04-19/0/00:24:40.rec_0.mp4 RTSP/1.0\r\n" +
                "Transport:PGSP/AVP;unicast;destination=192.168.12.188;client_port=9405\r\n"
                +"CSeq:2";
        byte[] buf2 = s2.getBytes();
        out.write(buf2);
        //接受rpu到主站的回复url

        String s3 = "PLAY rtsp://192.168.12.201:554/data/data01/2018-04-19/0/00:24:40.rec_0.mp4 RTSP/1.0\r\n" +
                "Range:clock=20121219T002440Z\r\n" +
                "Scale:1.0\r\n" +
                "CSeq:3\r\n" +
                "Session:13559105531869000763";
        byte[] buf3 = s3.getBytes();
        out.write(buf3);

        /////// udp接受

        //创建UDP接收方
        DatagramSocket socket = new DatagramSocket();  //创建套接字
        //接收服务器反馈数据
        byte[] backbuf = new byte[1024];
        DatagramPacket backPacket = new DatagramPacket(backbuf, backbuf.length);
        socket.receive(backPacket);  //接收返回数据
        String backMsg = new String(backbuf, 0, backPacket.getLength());
        System.out.println("服务器返回的数据为:" + backMsg);

        ///////
        String s4 = "DESCRIBE rtsp://192.168.12.201:554/data/data01/2018-04-19/0/00:24:40.rec_0.mp4 RTSP/1.0" +
                "User-Agent:GDDWStation/1.0" +
                "Accept:application/sdp" +
                "CSeq:1";
        byte[] buf4 = s4.getBytes();
        String s5 = "DESCRIBE rtsp://192.168.12.201:554/data/data01/2018-04-19/0/00:24:40.rec_0.mp4 RTSP/1.0" +
                "User-Agent:GDDWStation/1.0" +
                "Accept:application/sdp" +
                "CSeq:1";
        byte[] buf5 = s5.getBytes();





        socket.close();

    }
}
