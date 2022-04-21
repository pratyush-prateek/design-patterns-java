package com.designpatters.factory;

public abstract class Factory {
    public void performBusinessLogic() {
        Product product = this.createProduct();
        product.businessLogic();
    }
    abstract public Product createProduct();
}
