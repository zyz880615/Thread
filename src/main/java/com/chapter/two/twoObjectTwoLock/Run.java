package com.chapter.two.twoObjectTwoLock;

import com.chapter.two.extthread.ThreadA;
import com.chapter.two.extthread.ThreadB;

public class Run {
    public static void main(String[] args){
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
