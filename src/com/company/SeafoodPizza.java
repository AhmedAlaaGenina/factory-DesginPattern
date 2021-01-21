package com.company;

public class SeafoodPizza implements Pizza {

    public SeafoodPizza() {
        prepare();
        bake();
        cut();
        box();
    }
    @Override
    public void prepare() {
        System.out.println("SeafoodPizza prepare");

    }

    @Override
    public void bake() {
        System.out.println("SeafoodPizza bake");

    }

    @Override
    public void cut() {
        System.out.println("SeafoodPizza cut");

    }

    @Override
    public void box() {
        System.out.println("SeafoodPizza box");

    }
}
