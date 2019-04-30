package com.chapter.two.test2;

public class ThreadA extends Thread {

    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject) {
        super();
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(myObject);
    }
}
