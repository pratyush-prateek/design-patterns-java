package com.designpatters.decorator;

public class ThinBase implements PizzaElement {
    private int price;
    private String description;
    public ThinBase() {
        this.price = 20;
        this.description = "Thin Base";
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
