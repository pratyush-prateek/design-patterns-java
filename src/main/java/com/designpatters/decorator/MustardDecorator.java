package com.designpatters.decorator;

public class MustardDecorator extends Decorator {
    public MustardDecorator(Bread customBread) {
        super(customBread);
    }

    private String addMustard() {
        return " + mustard";
    }

    public String make() {
        return customBread.make() + addMustard();
    }
}
