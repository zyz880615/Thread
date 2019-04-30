package com.chapter.two.t8.mythread;

import com.chapter.two.t8.mytask.Task;

public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
