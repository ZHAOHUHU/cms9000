package com.teamway.cms.zhaotest;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpThread extends Thread {
    private String name;

    public UdpThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        final byte[] temp = new byte[1024];
        final DatagramPacket pack = new DatagramPacket(temp, temp.length);
        try {
            final DatagramSocket socket = new DatagramSocket();
            socket.receive(pack);
            String filename = "C:/" + name + ".PGSP";
            final File file = new File(filename);
            if (!file.exists()) {
                file.mkdir();
            }
            final FileOutputStream out = new FileOutputStream(file);
            final BufferedOutputStream buf = new BufferedOutputStream(out);
            int len;

            while ((len = pack.getLength()) != 0) {
                buf.write(temp, 0, len);
            }
            System.out.println("存储成功");
            out.close();
            socket.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
