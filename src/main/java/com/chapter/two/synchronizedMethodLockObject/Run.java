package com.chapter.two.synchronizedMethodLockObject;

public class Run {
    public static void main(String[] args){
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
