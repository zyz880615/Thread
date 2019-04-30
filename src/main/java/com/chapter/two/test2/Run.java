package com.chapter.two.test2;

/**
 * 当其他线程执行x对象中synchronized同步方法时呈同步效果
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(service, object);
        threadA.setName("A");
        threadA.start();
        ThreadA.sleep(1000);
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadB.start();
    }
}
