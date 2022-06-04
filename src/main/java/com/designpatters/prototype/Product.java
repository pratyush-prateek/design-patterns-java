package com.designpatters.prototype;

public abstract class Product {
    private String title;
    private String url;
    private int price;

    public Product() {}
    public Product(Product source) {
        this();
        this.title = source.getTitle();
        this.price = source.getPrice();
        this.url = source.getUrl();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract Product clone();
}
