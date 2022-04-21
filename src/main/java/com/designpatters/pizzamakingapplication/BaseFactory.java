package com.designpatters.pizzamakingapplication;

import java.util.HashMap;

public class BaseFactory extends Factory{
    private HashMap<Integer,Base> cache= new HashMap<>();
    @Override
    public PizzaElement getElement(int id) {
        if(!this.cache.containsKey(id))
            this.cache.put(id, new Base(id));
        return this.cache.get(id);
    }
}
