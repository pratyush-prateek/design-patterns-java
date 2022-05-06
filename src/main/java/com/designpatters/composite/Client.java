package com.designpatters.composite;

public class Client {
    public static void main(String[] args) {

        // Primary orders
        Order order1 = new Product(10);
        Order order2 = new Product(20);
        Order order3 = new Product(30);
        Order box = new Box();
        box.addOrder(order1);
        box.addOrder(order2);
        box.addOrder(order3);

        Order order5 = new Product(40);
        Order order6 = new Product(50);
        Order order7 = new Product(60);

        Order mainBox = new Box();
        mainBox.addOrder(box);
        mainBox.addOrder(order5);
        mainBox.addOrder(order6);
        mainBox.addOrder(order7);
        System.out.println(mainBox.getPrice());

    }
}
