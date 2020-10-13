package com.tom;

public class FinanceReport implements Report {

    @Override
    public void print() {
        System.out.println("print finance Data");
    }

    @Override
    public void load() {
        System.out.println("loading to finance Data");
    }
}
