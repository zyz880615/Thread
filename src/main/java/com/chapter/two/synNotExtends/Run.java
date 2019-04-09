package com.chapter.two.synNotExtends;

public class Run {
    public static void main(String[] args){
        Sub sub = new Sub();
        MyThreadA a = new MyThreadA(sub);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(sub);
        b.setName("B");
        b.start();
    }
}
