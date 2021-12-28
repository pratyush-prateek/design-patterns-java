package com.designpatters.flyweight;

public class Order {
    private String orderId;
    private Item item;
    public Order(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }

    public void processOrder() {
        System.out.println("Order processed: " + item.toString() + ", " + orderId);
    }
}
