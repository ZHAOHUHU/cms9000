package com.teamway.cms.zhaotest;
import java.io.*;
import java.net.*;
public class UdpThread extends Thread {
    private String name;
    private DatagramSocket socket;
    public UdpThread(String name, DatagramSocket socket) {
        this.name = name;
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("走这里立马");
        final byte[] temp = new byte[50 * 1024];
        final DatagramPacket pack = new DatagramPacket(temp, temp.length);
        try {
            socket.setSoTimeout(3000);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        try {
            socket.receive(pack);
            String filename = VideoContro.getUrlValue("filepath") + name;
            final FileOutputStream out = new FileOutputStream(filename);
            final BufferedOutputStream buf = new BufferedOutputStream(out);
            int len = 0;
            int flushSize = 0;
            while ((len = pack.getLength()) != 0) {
                buf.write(temp, 0, len);
                if (++flushSize % 1000 == 0) {
                    flushSize = 0;
                    buf.flush();
                }
                try {
                    socket.receive(pack);
                }catch (InterruptedIOException e){
                    out.close();
                    socket.close();
                    break;
                }
            }
            System.out.println("存储成功");

        } catch (SocketException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
