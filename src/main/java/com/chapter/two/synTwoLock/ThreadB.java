package com.chapter.two.synTwoLock;

public class ThreadB extends Thread {

    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}
