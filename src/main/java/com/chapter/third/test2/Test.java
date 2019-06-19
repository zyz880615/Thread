package com.chapter.third.test2;

public class Test {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            MyThread1 myThread1 = new MyThread1(lock);
            myThread1.start();
            Thread.sleep(3000);
            MyThread2 myThread2 = new MyThread2(lock);
            myThread2.start();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
