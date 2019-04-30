package com.chapter.two.t8.test;

import com.chapter.two.t8.mytask.Task;
import com.chapter.two.t8.mythread.MyThread1;
import com.chapter.two.t8.mythread.MyThread2;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        myThread1.start();
        Thread.sleep(100);
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();
    }
}
