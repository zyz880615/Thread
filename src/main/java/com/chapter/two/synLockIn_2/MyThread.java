package com.chapter.two.synLockIn_2;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
