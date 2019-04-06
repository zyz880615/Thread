package com.chapter.one.t19;

import com.chapter.one.t3.MyThread;

public class Run {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(10);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(1);
            thread2.start();
        }
    }
}
