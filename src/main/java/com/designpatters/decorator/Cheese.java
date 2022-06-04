package com.designpatters.decorator;

public class Cheese extends BaseDecorator {
    private int price;
    private String description;
    public Cheese(PizzaElement pizzaElement) {
        super(pizzaElement);
        this.price = 6;
        this.description = "Cheese";
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
