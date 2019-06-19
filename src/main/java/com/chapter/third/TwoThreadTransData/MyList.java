package com.chapter.third.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("老张");
    }

    public int size() {
        return list.size();
    }
}
