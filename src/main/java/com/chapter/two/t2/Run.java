package com.chapter.two.t2;

/**
 * 成员变量线程不安全,需要在addI方法加synchronized
 */
public class Run {
    public static void main(String[] args){
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
