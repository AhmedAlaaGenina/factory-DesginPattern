package com.company;

public class VegatablePizza implements Pizza {

    public VegatablePizza() {
        prepare();
        bake();
        cut();
        box();
    }
    @Override
    public void prepare() {
        System.out.println("VegatablePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("VegatablePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("VegatablePizza cut");
    }

    @Override
    public void box() {
        System.out.println("VegatablePizza box");
    }
}
