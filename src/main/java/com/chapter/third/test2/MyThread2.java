package com.chapter.third.test2;

public class MyThread2 extends Thread {
    private Object object;

    public MyThread2(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println("开始notify time=" + System.currentTimeMillis());
            object.notify();
            System.out.println("结束notify time=" + System.currentTimeMillis());
        }
    }
}
