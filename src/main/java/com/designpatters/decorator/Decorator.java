package com.designpatters.decorator;

public abstract class Decorator implements Bread {
    protected Bread customBread;
    public Decorator(Bread customBread) {
        this.customBread = customBread;
    }

    public String make() {
        return customBread.make();
    }
}
