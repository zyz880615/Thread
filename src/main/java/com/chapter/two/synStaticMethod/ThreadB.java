package com.chapter.two.synStaticMethod;

public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}
