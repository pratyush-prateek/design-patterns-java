package com.designpatters.pizzamakingapplication;

public class PizzaBuilder {
    private Pizza pizza;
    private Factory baseFactory;
    private Factory sauceFactory;
    private Factory toppingFactory;
    private Factory cheeseFactory;
    public PizzaBuilder(){
        this.reset();
        this.baseFactory = new BaseFactory();
        this.sauceFactory = new SauceFactory();
        this.toppingFactory = new ToppingFactory();
        this.cheeseFactory = new CheeseFactory();
    }
    public void reset() {
        this.pizza = new Pizza();
    }
    public void buildBase(int id) {
        this.pizza.setBase(this.baseFactory.getElement(id));
    }

    public void buildSauce(int id) {
        this.pizza.setSauce(this.sauceFactory.getElement(id));
    }

    public void buildTopping(int id) {
        this.pizza.setTopping(this.toppingFactory.getElement(id));
    }

    public void buildCheese(int id) {
        this.pizza.setCheese(this.cheeseFactory.getElement(id));
    }

    public Pizza getPizza() {
        Pizza product = this.pizza;
        this.reset();
        return product;
    }
}
