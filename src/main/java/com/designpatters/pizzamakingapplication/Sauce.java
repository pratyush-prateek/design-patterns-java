package com.designpatters.pizzamakingapplication;

public class Sauce implements PizzaElement{
    private int sauceId;
    public Sauce(int sauceId) {
        this.sauceId = sauceId;
    }
    @Override
    public String getName() {
        return "Sauce with " + this.sauceId;
    }

    @Override
    public int getPrice() {
        return sauceId;
    }
}
