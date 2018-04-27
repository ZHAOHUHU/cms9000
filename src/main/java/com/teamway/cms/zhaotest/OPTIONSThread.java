package com.teamway.cms.zhaotest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class OPTIONSThread extends Thread {
    private List list;
    private List listname;
    private int i;
    private OutputStream out;
    private int CSeq;
    private Map session;
    private boolean b;
    private String rtspip;
    private  int rtspport;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
    public OPTIONSThread(List listname, int rtspport, String rtspip, List list, int i, OutputStream out, int CSeq, Map session, boolean b) {
        this.list = list;
        this.listname = listname;
        this.i = i;
        this.out = out;
        this.CSeq = CSeq;
        this.session = session;
        this.b=b;
        this.rtspip=rtspip;
        this.rtspport=rtspport;
    }

    @Override
    public void run() {

        while(b) {
            String s3 = "OPTIONS " +"rtsp://"+ rtspip + ":" + rtspport + "/" + list.get(i) + ":" + rtspport + "/"+listname.get(i)+" RTSP/1.0\r\n" +
                    "Range:clock=20121219T002440Z\r\n" +
                    "Scale:"+CSeq+"\r\n" +
                    "CSeq:\r\n" +
                    session.get("sessionid") + "\r\n";
            try {
                out.write(s3.getBytes());
                out.flush();
                Thread.sleep(1000 * 30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
}
