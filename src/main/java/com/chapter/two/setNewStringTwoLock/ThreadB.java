package com.chapter.two.setNewStringTwoLock;

public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.testMethod();
    }
}
