package com.example.counter;

public class Counter {
    private Integer mcount;

    public Counter() {
        mcount = 0;
    }

    public Integer getCount() {
        return mcount;
    }

    public void addCount() {
        mcount++;
    }

    public void resetCount() {
        mcount = 0;
    }
}
