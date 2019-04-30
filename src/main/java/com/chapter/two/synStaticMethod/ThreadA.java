package com.chapter.two.synStaticMethod;

public class ThreadA extends Thread {

    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
