package com.chapter.two.synTwoLock;

public class ThreadA extends Thread {

    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
