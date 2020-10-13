package com.tom;

public class HealthReport implements Report {
    @Override
    public void print() {
        System.out.println("print health");
    }

    @Override
    public void load() {
        System.out.println("Loading to health");
    }
}
