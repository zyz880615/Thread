package com.chapter.two.test1;

/**
 * 当多个线程同时执行synchronized(x){}同步代码块时呈同步效果
 */
public class Run1_1 {
    public static void main(String[] args){
        Service service = new Service();
        MyObeject obeject = new MyObeject();
        ThreadA threadA = new ThreadA(service,obeject);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(service,obeject);
        threadB.setName("b");
        threadB.start();
    }
}
