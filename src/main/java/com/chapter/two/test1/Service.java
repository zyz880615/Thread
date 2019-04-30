package com.chapter.two.test1;

public class Service {
    public void testMethod1(MyObeject obeject){
        synchronized (obeject){
            try {
                System.out.println("testMethod1 ______getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
