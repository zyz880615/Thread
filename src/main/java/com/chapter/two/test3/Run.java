package com.chapter.two.test3;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject, service);
        threadA.setName("A");
        threadA.start();
        threadA.sleep(1000);
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
