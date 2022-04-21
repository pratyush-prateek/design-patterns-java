package com.designpatters.factory;

public class ConcreteFactoryB extends Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
