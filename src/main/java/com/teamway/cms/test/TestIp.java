package com.teamway.cms.test;

import com.teamway.cms.zhaotest.VideoContro;

import java.net.InetAddress;

public class TestIp {
    public static void main(String[] args) {
        String s="192.168.12.188";
        final String[] m = s.split("\\.");
         String newip=m[3]+"."+m[2]+"."+m[1]+"."+m[0];
        System.out.println(newip);
    }
}
