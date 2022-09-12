package com.designpatters.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistryService {
    private Map<ProductType, Product> map;
    public RegistryService() {
        this.map = new HashMap<>();
        this.loadProducts();
    }

    public Product createProduct(ProductType productType) {
        try {
            Product product = (Product)this.map.get(productType).clone();
            System.out.println(product == this.map.get(productType));
            return product;
        }
        catch(NullPointerException e) {
            throw e;
        }
    }

    private void loadProducts() {
        Movie movie = new Movie();
        movie.setCategory("Entertainment");
        movie.setCost(20);
        movie.setImageUrl("URL_IMAGE");
        movie.setRating(5);
        movie.setPlayTime(200);

        Book book  = new Book();
        book.setCategory("Fiction books");
        book.setCost(20);
        book.setImageUrl("URL_IMAGE_BOOK");
        book.setAuthor("RL Stevenson");
        book.setNumberOfPages(200);

        this.map.put(ProductType.BOOK, book);
        this.map.put(ProductType.MOVIE, movie);
    }
}
