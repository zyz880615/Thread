package com.chapter.two.test1;

public class ThreadB extends Thread {
    private Service service;
    private MyObeject obeject;

    public ThreadB(Service service, MyObeject obeject) {
        this.service = service;
        this.obeject = obeject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(obeject);
    }
}
