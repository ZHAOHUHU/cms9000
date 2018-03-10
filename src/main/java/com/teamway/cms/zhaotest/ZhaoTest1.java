package com.teamway.cms.zhaotest;

import com.teamway.cms.pgutils.PG;
import com.teamway.cms.pgutils.PGPojo;
import com.teamway.cms.pgutils.PGUtil;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ZhaoTest1 {

    /*
    2203
     */
    public static void CPCODE_STOP_TALK_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2203, 0, 28, new byte[]{PG.CPTYPE_AUDIOTRANCFG},
                    new Object[]{new PG.CPTYPE_AUDIOTRANCFG(1, 1, 1, "192.168.12.60".getBytes(), 9800, "192.168.12.188".getBytes(), 9800, 1)});
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
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(2108, 0, 27, new byte[]{PG.CPTYPE_VIDEOTRANCFG},
                    new Object[]{new PG.CPTYPE_VIDEOTRANCFG(1, 1, 7, new byte[]{72}, 0, 1)});

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
    public static void CPCODE_REPORENVDATA() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
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
            Socket s = new Socket("192.168.12.60", 9800);
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
    public static void CPCODE_SET_ALMSUBSCRIPTION_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
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
   public static void CPCODE_SET_ALMDEPLOY_REQ() {
       try {
           Socket s = new Socket("192.168.12.60", 9800);
           // 构建IO
           InputStream is = s.getInputStream();
           OutputStream os = s.getOutputStream();
           PGPojo info = PGUtil.newInstancePGObject(1261, 0, 20, new byte[]{PG.CPTYPE_ALMDEPLO},
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
    public static void CPCODE_GET_IPINFOR_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo bean = PGUtil.newInstancePGObject(1253, 0, 3,new byte[]{}, new Object[]{});


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
    public static void CPCOT_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
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
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] b = new byte[0];
            Object[] objects = new Object[0];
            PGPojo bean = PGUtil.newInstancePGObject(1173, 0, 3,new byte[]{}, new Object[]{});


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
    1127
     */
    public static void CPCODET_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
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
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1103, 0, 15, new byte[]{PG.CPTYPE_INTVAL},
                    new Object[]{new PG.CPTYPE_INTVAL(1,0)});

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
    public static void CPCODE_GET_IPINFO_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] b = new byte[0];
            Object[] objects = new Object[0];
            PGPojo bean = PGUtil.newInstancePGObject(1073, 0, 3,new byte[]{}, new Object[]{});


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
    public static void CPCODE_GET_ENCODECFG_REQ() {
        try {
            Socket s = new Socket("192.168.12.60", 9800);
            // 构建IO
            final InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PGPojo info = PGUtil.newInstancePGObject(1053, 0, 8, new byte[]{PG.CPTYPE_INTVAL},
                    new Object[]{new PG.CPTYPE_INTVAL(1,1)});

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
}
