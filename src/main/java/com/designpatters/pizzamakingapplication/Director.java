package com.designpatters.pizzamakingapplication;

public class Director {
    public static void buildMargherita(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.buildBase(124);
        pizzaBuilder.buildSauce(145);
        pizzaBuilder.buildTopping(167);
        pizzaBuilder.buildCheese(654);
    }

    public static void buildChickenBBQ(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.buildBase(124);
        pizzaBuilder.buildSauce(145);
        pizzaBuilder.buildTopping(71);
        pizzaBuilder.buildCheese(102);
    }

}
