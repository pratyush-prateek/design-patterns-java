package com.designpatters.factory;

public class ProductB implements Product {
    @Override
    public void businessLogic() {
        System.out.println("Business logic of B");
    }
}
