package com.company;

public class CheesPizza implements Pizza {
    public CheesPizza() {
        prepare();
        bake();
        cut();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("CheesPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesPizza cut");

    }

    @Override
    public void box() {
        System.out.println("CheesPizza box");

    }
}
