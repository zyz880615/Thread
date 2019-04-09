package com.chapter.two.extthread;

import com.chapter.two.twoObjectTwoLock.HasSelfPrivateNum;

public class ThreadB extends Thread{
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
