package com.teamway.cms.test;

public class Boy extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 123; i++) {
            System.out.println("我是一个小男孩");
        }
    }
}
