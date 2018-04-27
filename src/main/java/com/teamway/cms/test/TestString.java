package com.teamway.cms.test;

public class TestString {
    public static void main(String[] args) {
        String s=new String( "             a fg               ");
        System.out.println(s.length());
        final String trim = s.trim();
        System.out.println(trim.length());
    }
}
