package com.designpatters.pizzamakingapplication;

public class Base implements PizzaElement {
    private int baseId;
    public Base(int baseId) {
        this.baseId = baseId;
        //make call to DB to get base attributes
    }
    @Override
    public String getName() {
        return "Name for " + baseId;
    }

    @Override
    public int getPrice() {
        return baseId;
    }
}
