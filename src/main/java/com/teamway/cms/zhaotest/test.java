package com.teamway.cms.zhaotest;

import java.io.*;
import java.net.URL;

public class test {

    public static void main(String[] args) throws IOException {
//        byte[] temp = {21, 3, 43, 0};
//        System.out.println(temp.length);
        URL url = test.class.getClassLoader().getResource("hello.txt");
        FileInputStream in = new FileInputStream(url.getFile());
        ByteArrayOutputStream read = new ByteArrayOutputStream();
        final FileOutputStream out = new FileOutputStream("E:/ideafolder/cms9000/src/main/resources/naoxin.txt");
        final byte[] temp = new byte[4];
        int len;
        while ((len = in.read(temp)) != -1) {
            //read.write(temp, 0, len);
            out.write(temp, 0, len);
        }
        System.out.println("复制成功");
        in.close();
        read.close();
        final byte[] bytes = read.toByteArray();


    }

}
