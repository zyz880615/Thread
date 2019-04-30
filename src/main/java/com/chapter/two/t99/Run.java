package com.chapter.two.t99;

public class Run {
    public static void main(String[] args){
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它! stopThread="
                + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
