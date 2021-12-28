package com.designpatters.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {
    private Catalog catalog = new Catalog();
    private List<Order> currentOrders = new CopyOnWriteArrayList<Order>();
    public Inventory() { }
    public void addOrder(String itemName, String orderId) {
        Item item = catalog.lookup(itemName);
        Order newOrder = new Order(orderId, item);
        currentOrders.add(newOrder);
    }

    public void process() {
        for(Order order: currentOrders) {
            order.processOrder();
            currentOrders.remove(order);
        }
    }

    public void reportItemsCreated() {
        System.out.println("New items created: " + catalog.totalItemsCreated());
    }
}
