package com.chapter.third.test2;

public class MyThread1 extends Thread {
    private Object object;

    public MyThread1(Object object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        try {
            synchronized (object){
                System.out.println("开始      wait time=" + System.currentTimeMillis());
                object.wait();
                System.out.println("结束      wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
