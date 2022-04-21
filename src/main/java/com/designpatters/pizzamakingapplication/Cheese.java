package com.designpatters.pizzamakingapplication;

public class Cheese implements PizzaElement {
    private int cheeseId;
    public Cheese(int cheeseId) {
        this.cheeseId = cheeseId;
    }
    @Override
    public String getName() {
        return "Name for" + cheeseId;
    }

    @Override
    public int getPrice() {
        return cheeseId;
    }
}
