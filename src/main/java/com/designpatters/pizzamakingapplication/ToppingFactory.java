package com.designpatters.pizzamakingapplication;

import java.util.HashMap;

public class ToppingFactory extends Factory {
    private HashMap<Integer,Topping> cache = new HashMap<>();
    @Override
    public PizzaElement getElement(int id) {
        if(!this.cache.containsKey(id))
            this.cache.put(id, new Topping(id));

        return this.cache.get(id);
    }
}
