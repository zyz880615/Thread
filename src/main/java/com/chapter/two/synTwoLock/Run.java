package com.chapter.two.synTwoLock;

public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadC.start();
    }
}
