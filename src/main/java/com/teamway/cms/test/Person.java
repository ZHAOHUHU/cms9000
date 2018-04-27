package com.teamway.cms.test;

public class Person {
    public static void main(String[] args) throws InterruptedException {
        final Boy boy = new Boy();
        final Student s = new Student("student");
        boy.start();
        s.start();
        for (int i = 0; i < 123; i++) {
            Person.sayHello("==============================================person");
        }

    }

    public static void sayHello(String msg) throws InterruptedException {

        System.out.println("你好我是person的" + msg);
        Thread.sleep(1230);
    }
}
