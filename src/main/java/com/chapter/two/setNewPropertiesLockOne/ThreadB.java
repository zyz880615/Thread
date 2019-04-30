package com.chapter.two.setNewPropertiesLockOne;

public class ThreadB extends Thread {

    private Service service;

    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }
}
