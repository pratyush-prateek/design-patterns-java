package com.designpatters.composite;

public class Product implements Order {
    private int price;
    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void addOrder(Order order) {
        throw new UnsupportedOperationException("Feature not supported for simple orders");
    }

    @Override
    public void removeOrder(Order order) {
        throw new UnsupportedOperationException("Feature not supported for simple orders");
    }
}
