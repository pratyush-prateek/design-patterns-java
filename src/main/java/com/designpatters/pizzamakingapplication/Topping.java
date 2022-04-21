package com.designpatters.pizzamakingapplication;

public class Topping implements PizzaElement {
    private int toppingId;
    public Topping(int toppingId) {
        this.toppingId = toppingId;
    }
    @Override
    public String getName() {
        return "Name for" + this.toppingId;
    }

    @Override
    public int getPrice() {
        return toppingId;
    }
}
