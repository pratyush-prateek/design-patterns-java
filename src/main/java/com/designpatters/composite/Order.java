package com.designpatters.composite;

public interface Order {
    public int getPrice();
    public void addOrder(Order order);
    public void removeOrder(Order order);
}
