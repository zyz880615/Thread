package com.chapter.one.t4_threadsafe;

import java.security.AlgorithmParameterGenerator;

public class Run {
    public static void main(String[] args){
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
