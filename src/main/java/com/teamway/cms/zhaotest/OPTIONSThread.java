package com.teamway.cms.zhaotest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

public class OPTIONSThread extends Thread {
    private List list;
    private int i;
   private PrintWriter writer;

    public OPTIONSThread(List list, int i, PrintWriter writer) {
        this.list = list;
        this.i = i;
        this.writer = writer;
    }

    @Override
    public void run() {

        for (; ; ) {
            String s3 = "OPTIONS " + list.get(i) + "RTSP/1.0\r\n" +
                    "Range:clock=20121219T002440Z\r\n" +
                    "Scale:1.0\r\n" +
                    "CSeq:3\r\n" +
                    "Session:13559105531869000763";
            try {
                writer.write(s3);
                Thread.sleep(1000 * 30);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
