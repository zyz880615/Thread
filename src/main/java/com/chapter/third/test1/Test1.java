package com.chapter.third.test1;

public class Test1 {
    public static void main(String[] args){
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
