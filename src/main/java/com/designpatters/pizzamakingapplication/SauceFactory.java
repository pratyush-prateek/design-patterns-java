package com.designpatters.pizzamakingapplication;

import java.util.HashMap;

public class SauceFactory extends Factory {
    private HashMap<Integer,Sauce> cache = new HashMap<>();
    @Override
    public PizzaElement getElement(int id) {
        if(!this.cache.containsKey(id))
            this.cache.put(id, new Sauce(id));

        return this.cache.get(id);
    }
}
