package com.chapter.two.test2;

public class Service {
    public void testMethod1 (MyObject myObject){
        synchronized (myObject) {
            try {
                System.out.println("testMethod1 ___getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
