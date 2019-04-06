package com.chapter.one.t12;

public class Run3 {
    public static void main(String[] args){
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ ＝" + myThread.isInterrupted());
            System.out.println("是否停止2？ ＝" + myThread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
