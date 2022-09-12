package com.designpatters.prototype;

public abstract class Product {
    private int cost;
    private String category;
    private String imageUrl;
    public Product() {}
    public Product(Product source) {
        this.cost = source.cost;
        this.category = source.category;
        this.imageUrl = source.imageUrl;
    }

    public abstract Product clone();

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
