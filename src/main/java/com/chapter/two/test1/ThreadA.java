package com.chapter.two.test1;

public class ThreadA extends Thread {
    private Service service;
    private MyObeject obeject;

    public ThreadA(Service service, MyObeject obeject) {
        this.service = service;
        this.obeject = obeject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(obeject);
    }
}
