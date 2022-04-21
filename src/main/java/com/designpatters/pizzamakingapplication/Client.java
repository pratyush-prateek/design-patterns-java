package com.designpatters.pizzamakingapplication;

public class Client {
    public static void main(String args[]) throws Exception {
        String order = args[0];
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        switch(order) {
            case "Margherita":
                Director.buildMargherita(pizzaBuilder);
                break;
            case "BBQChicken":
                Director.buildChickenBBQ(pizzaBuilder);
                break;
            default:
                throw new Exception("No such order");
        }

        Pizza pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.getPrice());
    }
}
