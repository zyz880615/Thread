package com.chapter.two.AtomicIntegerTest;

public class Run {
    public static void main(String[] args){
        AddCountThread countThread = new AddCountThread();
        Thread t1 = new Thread(countThread);
        t1.start();
        Thread t2 = new Thread(countThread);
        t2.start();
        Thread t3 = new Thread(countThread);
        t3.start();
    }
}
