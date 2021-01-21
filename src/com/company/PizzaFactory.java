package com.company;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if ("Cheese Pizze".equals(type)) {
            return new CheesPizza();
        } else if ("Seafood Pizze".equals(type)) {
            return new SeafoodPizza();
        } else if ("Vegatable Pizze".equals(type)) {
            return new VegatablePizza();
        }
        return null;
    }
}
