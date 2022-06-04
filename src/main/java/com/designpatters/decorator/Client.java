package com.designpatters.decorator;

public class Client {
    public static void main(String args[])throws Exception {
        //Thick base + 2*perperroni + 1*cheese + 3*olives
        PizzaElement pizza = new ThickBase();
        pizza = new Peperroni(pizza);
        pizza = new Peperroni(pizza);
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        pizza = new Olives(pizza);
        pizza = new Olives(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
