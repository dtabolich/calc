package com.epam.learn;

public class Calc {
    private int val = 0;

    public Calc(int val) {
        this.val = val;
    }

    public int add(int x) {
        this.val += x;
        return this.val;
    }

}
