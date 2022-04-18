package com.designpatters.singleton;

public class Client {
    public static void main(String[] args) {
        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
