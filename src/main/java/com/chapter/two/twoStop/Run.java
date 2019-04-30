package com.chapter.two.twoStop;

public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
