package com.designpatters.decorator;

public class NormalBread implements Bread {
    @Override
    public String make() {
        return "Normal bread";
    }
}
