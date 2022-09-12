package com.designpatters.singleton;

public class Client {
    public static void main(String[] args) {
        //Database instance1 = Database.getInstance();
        //Database instance2 = Database.getInstance();

        //System.out.println(instance1);
        //System.out.println(instance2);

        //Multithreaded check
        Thread t1 = new Thread(() -> {
            Database instance = Database.getInstance();
            System.out.println(instance);
        });

        Thread t2 = new Thread(() -> {
            Database instance = Database.getInstance();
            System.out.println(instance);
        });

        t1.start();
        t2.start();
    }
}
