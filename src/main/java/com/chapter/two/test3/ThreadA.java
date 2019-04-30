package com.chapter.two.test3;

public class ThreadA extends Thread {

    private MyObject myObject;

    private Service service;

    public ThreadA(MyObject myObject, Service service) {
        super();
        this.myObject = myObject;
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(myObject);
    }
}
