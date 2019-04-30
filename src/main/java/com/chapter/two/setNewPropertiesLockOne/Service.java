package com.chapter.two.setNewPropertiesLockOne;

public class Service {
    public void serviceMethodA (UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
