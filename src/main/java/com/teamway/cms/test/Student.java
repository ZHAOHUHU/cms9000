package com.teamway.cms.test;

public class Student extends Thread {
    private String str;

    public Student(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("我是一个学生" + str);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
