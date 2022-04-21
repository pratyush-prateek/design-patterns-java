package com.designpatters.factory;

public class ProductA implements Product {
    @Override
    public void businessLogic() {
        System.out.println("Business logic for A");
    }
}
