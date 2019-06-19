package com.chapter.third.notifyHoldLock;

public class Test {
    public static void main(String[] args){
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
}
