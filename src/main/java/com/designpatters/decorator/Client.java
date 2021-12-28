package com.designpatters.decorator;

public class Client {
    public static void main(String[] args) {
        //Garlic bread turkey mustard sandwich
        Bread customSandwich = new TurkeyDecorator(new MustardDecorator(new GarlicBread()));
        System.out.println(customSandwich.make());

        //Normal bread turkey mustard
        customSandwich = new TurkeyDecorator(new MustardDecorator(new NormalBread()));
        System.out.println(customSandwich.make());

    }
}
