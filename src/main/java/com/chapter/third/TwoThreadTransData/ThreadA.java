package com.chapter.third.TwoThreadTransData;

public class ThreadA extends Thread {
    private MyList myList;

    public ThreadA(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++){
                myList.add();
                System.out.println("添加了" + ( i + 1) + "个元素");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
