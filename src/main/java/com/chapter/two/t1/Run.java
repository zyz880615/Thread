package com.chapter.two.t1;

/**
 * 局部变量线程安全
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
