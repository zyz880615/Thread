package com.chapter.two.setNewPropertiesLockOne;

public class Run {
    public static void main(String[] args){
        try {
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA threadA = new ThreadA(service, userInfo);
            threadA.setName("A");
            threadA.start();
            Thread.sleep(50);
            ThreadB threadB = new ThreadB(service, userInfo);
            threadB.setName("B");
            threadB.start();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
