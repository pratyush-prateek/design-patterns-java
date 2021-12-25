package com.designpatters.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
