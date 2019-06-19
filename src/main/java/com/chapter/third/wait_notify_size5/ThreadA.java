package com.chapter.third.wait_notify_size5;

public class ThreadA extends Thread {
    private Object object;

    public ThreadA(Object object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {
                if (MyList.size() != 5){
                    System.out.println("wait begin "
                            + System.currentTimeMillis());
                    object.wait();
                    System.out.println("wait end "
                            + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
