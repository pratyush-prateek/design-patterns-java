package com.designpatters.decorator;

public class BaseDecorator implements PizzaElement {
    private PizzaElement pizzaElement;
    public BaseDecorator(PizzaElement pizzaElement) {
        this.pizzaElement = pizzaElement;
    }

    @Override
    public int getPrice() {
        return this.pizzaElement.getPrice();
    }

    @Override
    public String getDescription() {
        return this.pizzaElement.getDescription();
    }
}
