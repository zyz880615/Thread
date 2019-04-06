package com.chapter.one.t13;

public class Run {
    public static void main(String[] args){
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(300);
            myThread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
