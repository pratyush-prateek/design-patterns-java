package com.designpatters.pizzamakingapplication;

public class Pizza {
    private PizzaElement base;
    private PizzaElement sauce;
    private PizzaElement topping;
    private PizzaElement cheese;

    public PizzaElement getBase() {
        return base;
    }

    public void setBase(PizzaElement base) {
        this.base = base;
    }

    public PizzaElement getSauce() {
        return sauce;
    }

    public void setSauce(PizzaElement sauce) {
        this.sauce = sauce;
    }

    public PizzaElement getTopping() {
        return topping;
    }

    public void setTopping(PizzaElement topping) {
        this.topping = topping;
    }

    public PizzaElement getCheese() {
        return cheese;
    }

    public void setCheese(PizzaElement cheese) {
        this.cheese = cheese;
    }

    public int getPrice() {
        return this.base.getPrice() + this.sauce.getPrice() + this.topping.getPrice() + this.cheese.getPrice();
    }
}
