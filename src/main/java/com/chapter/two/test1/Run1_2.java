package com.chapter.two.test1;

public class Run1_2 {
    public static void main(String[] args){
        Service service = new Service();
        MyObeject myObeject1 = new MyObeject();
        MyObeject myObeject2 = new MyObeject();
        ThreadA threadA = new ThreadA(service,myObeject1);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(service,myObeject2);
        threadB.setName("b");
        threadB.start();
    }
}
