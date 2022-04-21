package com.designpatters.factory;

public class Client {
    private static Factory factory;
    public static void main(String[] args) throws Exception {
        String type = args[0];
        switch (type) {
            case "A":
                factory = new ConcreteFactoryA();
                break;
            case "B":
                factory = new ConcreteFactoryB();
                break;
        }

        factory.performBusinessLogic();

    }
}
