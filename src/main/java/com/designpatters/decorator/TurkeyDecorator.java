package com.designpatters.decorator;

public class TurkeyDecorator extends Decorator {
    public TurkeyDecorator(Bread customBread) {
        super(customBread);
    }

    public String make() {
        return customBread.make() + addTurkey();
    }

    private String addTurkey() {
        return " + Turkey";
    }
}
