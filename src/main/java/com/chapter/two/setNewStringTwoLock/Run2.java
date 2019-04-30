package com.chapter.two.setNewStringTwoLock;

public class Run2 {
    public static void main(String[] args){
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
