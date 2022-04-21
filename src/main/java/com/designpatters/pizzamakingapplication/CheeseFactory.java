package com.designpatters.pizzamakingapplication;

import java.util.HashMap;

public class CheeseFactory extends Factory{
    private HashMap<Integer,Cheese> cache = new HashMap<>();
    @Override
    public PizzaElement getElement(int id) {
        if(!this.cache.containsKey(id))
            cache.put(id, new Cheese(id));

        return cache.get(id);
    }
}
