package com.designpatters.flyweight;

public class Client {
    public static void main(String args[]) {
        Inventory ins = new Inventory();
        ins.addOrder("TV", "42");
        ins.addOrder("Jabra headphones", "56");
        ins.addOrder("TV","4578");
        ins.addOrder("Book","256");
        ins.addOrder("Jabra headphones","123");
        ins.addOrder("Book","14569");

        ins.process();

        ins.reportItemsCreated();
    }
}
