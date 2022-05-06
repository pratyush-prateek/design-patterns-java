package com.designpatters.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Order {
    private List<Order> orders;
    public Box() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        if(order == this)
            throw new UnsupportedOperationException("Adding to itself not supported");

        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(Order order: this.orders){
            price += order.getPrice();
        }

        return price;
    }
}
