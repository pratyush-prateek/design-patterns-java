package com.designpatters.decorator;

public class Olives extends BaseDecorator {
    private int price;
    private String description;
    public Olives(PizzaElement pizzaElement) {
        super(pizzaElement);
        this.price = 7;
        this.description = "Olives";
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
