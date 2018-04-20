package com.teamway.cms.zhaotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import com.teamway.cms.pgutils.PG;
import com.teamway.cms.pgutils.PGPojo;
import com.teamway.cms.pgutils.PGUtil;

public class zhaotest {
    /*
  2203
   */
    public static void CPCODE_STOP_TALK_RQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2203, 0, 28, new byte[]{PG.CPTYPE_AUDIOTRANCFG},
                    new Object[]{new PG.CPTYPE_AUDIOTRANCFG(1, 1, 1, "192.168.12.31".getBytes(), 9800, "192.168.12.188".getBytes(), 9800, 1)});
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});
            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
 2108
     */
    public static void CPCODE_START_VIDEO_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2108, 0, 27, new byte[]{PG.CPTYPE_VIDEOTRANCFG},
                    new Object[]{new PG.CPTYPE_VIDEOTRANCFG(1, 1, 7, "192.168.12.31".getBytes(), 0, 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1285
     */
    public static void CPCODE_REPOREVDATA() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1285, 0, 24, new byte[]{PG.CPTYPE_ENVDATA_CFG},
                    new Object[]{new PG.CPTYPE_ENVDATA(1, 12, 7, 0, new byte[]{})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1275
     */
    public static void CPCODE_SET_ALARM_CFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1275, 0, 23, new byte[]{PG.CPTYPE_ALM_CFG},
                    new Object[]{new PG.CPTYPE_ALM_CFG(1, 12, 7, new byte[]{12}, 3, 4, new byte[]{})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1267
     */
    public static void CPCODE_SET_ALMSUBCRIPTION_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1267, 0, 22, new byte[]{PG.CPTYPE_ALMSUBSCRIPTION},
                    new Object[]{new PG.CPTYPE_ALMSUBSCRIPTION(1, 12, 0, 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1263
     */
    public static void CPCODE_SET_ALMDPLOY_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1263, 0, 20, new byte[]{PG.CPTYPE_ALMDEPLO},
                    new Object[]{new PG.CPTYPE_ALMDEPLO((long) 1, 12, 0, 1, 12)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1253MEIYOUSHUXINGTOU
     */
    public static void CPCODE_GET_IPINFR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo bean = PGUtil.newInstancePGObject(1253, 0, 3, new byte[]{}, new Object[]{});


            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});

            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(bean);
            os.write(bytes1);
            os.write(bytes);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1243
     */
    public static void CPOT_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1243, 0, 15, new byte[]{PG.CPTYPE_INT},
                    new Object[]{new PG.CPTYPE_INT(1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1173没属性attr
     */
    public static void CPCODE_GET_IPINR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] b = new byte[0];
            Object[] objects = new Object[0];
            PGPojo bean = PGUtil.newInstancePGObject(1173, 0, 3, new byte[]{}, new Object[]{});


            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});

            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(bean);
            os.write(bytes1);
            os.write(bytes);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1127 重启
     */
    public static void CPCODET_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1127, 0, 15, new byte[]{PG.CPTYPE_INT},
                    new Object[]{new PG.CPTYPE_INT(1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1103
     */
    public static void CPCODE_GET_PTZPRESET_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1103, 0, 15, new byte[]{PG.CPTYPE_INTVAL},
                    new Object[]{new PG.CPTYPE_INTVAL(1, 0)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1073 和1013一个毛病啊没有头
     */
    public static void CPCODE_GET_TIMEINFO_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] b = new byte[0];
            Object[] objects = new Object[0];
            PGPojo bean = PGUtil.newInstancePGObject(1073, 0, 3, new byte[]{}, new Object[]{});


            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});

            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(bean);
            os.write(bytes1);
            os.write(bytes);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1053
     */
    public static void CPCODE_GET_ENCODECG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            final InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1053, 0, 8, new byte[]{PG.CPTYPE_INTVAL},
                    new Object[]{new PG.CPTYPE_INTVAL(1, 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println(mess);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
   3007
     */
    public static void CPCODE_TER_RSP() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(3007, 0, 28, new byte[]{PG.CPTYPE_MESSAGECODE, PG.CPTYPE_REGRESULT},
                    new Object[]{new PG.CPTYPE_REGRESULT(2), new PG.CPTYPE_MESSAGECODE(1, 5, new byte[]{3})});
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});
            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
 3003
     */
    public static void CPCODE_REGISTER_RSP() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(3003, 0, 28, new byte[]{PG.CPTYPE_MESSAGECODE, PG.CPTYPE_REGRESULT},
                    new Object[]{new PG.CPTYPE_REGRESULT(2), new PG.CPTYPE_MESSAGECODE(1, 5, new byte[]{3})});
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});
            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    2206
   CPTYPE_AUDIOTRANCFG
        */
    public static void CPCODE_STOP_TALK_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2206, 0, 28, new byte[]{PG.CPTYPE_AUDIOTRANCFG},
                    new Object[]{new PG.CPTYPE_AUDIOTRANCFG(1, 1, 1, "192.168.12.188".getBytes(), 9800, "192.162.12.31".getBytes(), 1, 1)});
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});
            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    2205
    SPTYPE_AUDIODATA
     */
    public static void CPCODE_START_TALK_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2205, 0, 27, new byte[]{PG.SPTYPE_AUDIODATA},
                    new Object[]{new PG.SPTYPE_AUDIODATA((byte) 1, (byte) 12, (byte) 1, (byte) 3, (short) 9, (byte) 1, (byte) 4, (byte) 12, new byte[]{3}, (byte) 7, (byte) 3, (short) 0, 1, 5, 1, 2)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    2105
    CPTYPE_VIDEOTRANCFG
    CPCODE_START_VIDEO_REQ
     */
    public static void CPCODE_START_VDEO_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2105, 0, 27, new byte[]{PG.CPTYPE_VIDEOTRANCFG},
                    new Object[]{new PG.CPTYPE_VIDEOTRANCFG(1, 1, 2,"192.168.12.31".getBytes(), 9800, 16)});
            System.out.println("192.168.12.31".getBytes().length);
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
   2000
     */
    public static void SPCODE_ACK() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2000, 0, 26, new byte[]{PG.SPTYPE_DATAACK},
                    new Object[]{new PG.SPTYPE_DATAACK((byte) 1, (byte) 12, (byte) 7, (byte) 9, (byte) 0, (byte) 5, new byte[]{12}, (byte) 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1293
    CPTYPE_EXTERNAL_CTRL
     */
    public static void CPCODE_EXTERNAL_CTRL_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1293, 0, 25, new byte[]{PG.CPTYPE_EXTERNAL_CTRL},
                    new Object[]{new PG.CPTYPE_EXTERNAL_CTRL(1, 12, 7, 9, 0, new byte[]{})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1283
    CPTYPE_ENVDATA_CFG
     */
    public static void CPCODE_REPORENVDATA() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1283, 0, 24, new byte[]{PG.CPTYPE_ENVDATA_CFG},
                    new Object[]{new PG.CPTYPE_ENVDATA(1, 12, 7, 0, new byte[]{})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1273
    CPTYPE_ALM_CFG
     */
    public static void CPCODE_SET_ALARM_CFG_RQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1273, 0, 23, new byte[]{PG.CPTYPE_ALM_CFG},
                    new Object[]{new PG.CPTYPE_ALM_CFG(1, 12, 7, new byte[]{12}, 3, 4, new byte[]{})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1265
    CPTYPE_ALMSUBSCRIPTION
     */
    public static void CPCODE_SET_ALMSUBSCRIPTION_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1265, 0, 22, new byte[]{PG.CPTYPE_ALMSUBSCRIPTION},
                    new Object[]{new PG.CPTYPE_ALMSUBSCRIPTION(1, 12, 0, 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1263少了几个结构体
     */
    public static void CPCODE_GET_ALMDEPLOY_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1263, 0, 21, new byte[]{PG.CPTYPE_ALMDEPLOY},
                    new Object[]{new PG.CPTYPE_ALMDEPLOYCOPY((long) 1, 1, 1, 0, 0)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1261
    CPTYPE_ALMDEPLOY
     */
    public static void CPCODE_SET_ALMDEPLOY_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1261, 0, 20, new byte[]{PG.CPTYPE_ALMDEPLOY},
                    new Object[]{new PG.CPTYPE_ALMDEPLOY((long) 1, 12, 0, 1, 12, new PG.CameraInfo((long) 12, 12, 5), new PG.AlmInfo((long) 4, 1))});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1241
     */
    public static void CPCODE_SET_HIDEAREA_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1241, 0, 19, new byte[]{PG.CPTYPE_HIDEAREA},
                    new Object[]{new PG.CPTYPE_HIDEAREA(1, 142, 134, 20, 20)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


     /*
     1171
      */
    public static void CPCODE_SET_MANAGECFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1171, 0, 18, new byte[]{PG.CPTYPE_MANAGECFG},
                    new Object[]{new PG.CPTYPE_MANAGECFG(1, new byte[]{12}, new byte[]{12}, new byte[]{12}, 995)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     1163
     */
    public static void CPCODE_GET_LOGINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] temp=new byte[]{12};
            PGPojo info = PGUtil.newInstancePGObject(1163, 0, 17, new byte[]{PG.CPTYPE_LOGINFOSEARCH},
                    new Object[]{new PG.CPTYPE_LOGINFOSEARCH(0, 3, 112,"2018-03-20 08:00:00".getBytes(), "2018-03-20 15:00:00".getBytes())});
            System.out.println("2018-03-20 08:00:00".getBytes().length);

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1106
     */
    public static void CPCODE_SET_PTZHOME_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1106, 0, 16, new byte[]{PG.CPTYPE_PTZHOME},
                    new Object[]{new PG.CPTYPE_PTZHOME(1, 5, 3, 6)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
     1108
     */
    public static void CPCOT_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1108, 0, 15, new byte[]{PG.CPTYPE_INT},
                    new Object[]{new PG.CPTYPE_INT(1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1101
     */
    public static void CPCODE_SET_PTZPRESET_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1101, 0, 14, new byte[]{PG.CPTYPE_PTZPRESET},
                    new Object[]{new PG.CPTYPE_PTZPRESET(1, 1, new byte[]{45})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
      1097
     */
    public static void CPCODE_CTL_PTZ_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1097, 0, 13, new byte[]{PG.CPTYPE_CTLPTZ},
                    new Object[]{new PG.CPTYPE_CTLPTZ(1, 1, new int[]{0})});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    1071
     */
    public static void CPCODE_SET_TIME_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1071, 0, 12, new byte[]{PG.CPTYPE_SYSTIME, PG.CPTYPE_NTPSERVER, PG.CPTYPE_TIMEZONE},
                    new Object[]{new PG.CPTYPE_SYSTIME(2018, 4, 5, 8, 46, 52), new PG.CPTYPE_NTPSERVER("10.0.0.1".getBytes(), "10.0.0.2".getBytes(), "10.0.0.3".getBytes()), new PG.CPTYPE_TIMEZONE(1, new byte[]{12})
                    });

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     1067
     */
    public static void CPCODE_GET_RPUSYSCFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1067, 0, 11, new byte[]{},
                    new Object[]{});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1065
     */
    public static void CPCODE_SET_RPUSYSCFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1065, 0, 10, new byte[]{PG.CPTYPE_SVCADDR},
                    new Object[]{new PG.CPTYPE_IPCNAME("dsfs".getBytes(),"1".getBytes(),1,1,"sdf".getBytes(),"dsf".getBytes(),"df".getBytes(),1,new PG.neibushebei[]{new PG.neibushebei(2,"ds".getBytes())})});

            System.out.println();
            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1053 he1043差不多,多一个osd参数
     */
    public static void CPCODE_GET_OSDCFG_REQ() {

    }

    /*
    1051
     */
    public static void CPCODE_SET_OSDCFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1051, 0, 9, new byte[]{PG.CPTYPE_OSDCFG},
                    new Object[]{
                            new PG.CPTYPE_OSDCFG(1, 5, new PG.osd_info(2, 5, 8, 4, 7, new byte[]{12}))});


            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            Thread.sleep(500);
            os.write(bytes1);
            Thread.sleep(500);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
    1043获取ipc的编码参数信息
     */
    public static void CPCODE_GET_ENCODECFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            final InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1043, 0, 8, new byte[]{PG.CPTYPE_INT},
                    new Object[]{new PG.CPTYPE_INT(1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println(mess);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1041设置RPU编码参数
     */
    public static void CPCODE_SET_ENCODECFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1041, 0, 7, new byte[]{PG.CPTYPE_ENCODE},
                    new Object[]{new PG.CPTYPE_ENCODE(1, 16, 720, 2, 5, 25, 1000, 50, 0)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1035删除用户信息
     */
    public static void CPCODE_DEL_UCPCODE_DEL_U() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1035, 0, 6, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("kkkkk".getBytes(), "654321".getBytes(), (short) 1, (short) 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     1023获取用户信息
     */
    public static void CPCODE_GET_USERINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] b = new byte[0];
            Object[] objects = new Object[0];
            PGPojo info = PGUtil.newInstancePGObject(1023, 0, 5, b, objects);

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1021增加修改用户
     */
    public static void CPCODE_SET_USERINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1021, 0, 4, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("kkkkk".getBytes(), "654321".getBytes(), (short) 1, (short) 1)});

            PGPojo info1 = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(info1);
            os.write(bytes);
            os.write(bytes1);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    获取IP地址1013
     */
    public static void CPCODE_GET_IPINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo bean = PGUtil.newInstancePGObject(1013, 0, 3, new byte[]{}, new Object[]{});


            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});

            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(bean);
            os.write(bytes1);
            os.write(bytes);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    设置ip地址1011
     */
    public static void CPCODE_SET_IPINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.55", 9800);
            final InputStream is = s.getInputStream();
            final OutputStream out = s.getOutputStream();
            PGPojo bean = PGUtil.newInstancePGObject(PG.SET_IPINFO_REQ, 0, 2, new byte[]{PG.CPTYPE_IPINFO},
                    new Object[]{new PG.CPTYPE_IPINFO(1, "192.168.12.31".getBytes(), "255.255.255.0".getBytes(), "8.8.8.8".getBytes(), "192.168.12.250".getBytes())});

            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});


            byte[] bytes1 = PGUtil.pgObjectToByteArray(info);
            byte[] bytes = PGUtil.pgObjectToByteArray(bean);
            out.write(bytes1);
            out.write(bytes);
            out.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 用户登录3004
     */
    public static void CPTYPE_USERINFO() {
        try {
            Socket s = new Socket("192.168.12.31", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(PG.LOGIN_REQ, 0, 1, new byte[]{PG.CPTYPE_USERINFO},
                    new Object[]{
                            new PG.CPTYPE_USERINFOR("admin".getBytes(), "123456".getBytes(), (short) 1, (short) 1)});

            byte[] bs = PGUtil.pgObjectToByteArray(info);

            os.write(bs);
            os.flush();
            //关闭连接
            // 读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println(mess);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
