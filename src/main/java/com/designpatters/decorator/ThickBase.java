package com.designpatters.decorator;

public class ThickBase implements PizzaElement {
    private int price;
    private String description;
    public ThickBase() {
        this.price = 10;
        this.description = "Thick Base";
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
