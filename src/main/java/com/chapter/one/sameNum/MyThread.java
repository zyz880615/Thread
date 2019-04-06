package com.chapter.one.sameNum;

public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadNmae="
                + Thread.currentThread().getName());
    }
}
