package com.designpatters.factory;

public class ConcreteFactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
