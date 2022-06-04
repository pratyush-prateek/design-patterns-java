package com.designpatters.decorator;

public class Peperroni extends BaseDecorator {
    private int price;
    private String description;
    public Peperroni(PizzaElement pizzaElement) {
        super(pizzaElement);
        this.price = 5;
        this.description = "Peperroni";
    }

    @Override
    public int getPrice() {
        return this.price + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }
}
