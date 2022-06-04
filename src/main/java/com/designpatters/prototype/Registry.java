package com.designpatters.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Product> items = new HashMap<String,Product>();
    public Registry() {
        this.loadItems();
    }

    public Product createItem(String type) {
        Product product = null;
        try {
            product = (Product)(items.get(type).clone());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setDuration(28);
        movie.setPrice(400);
        movie.setTitle("My movie");

        this.items.put("movie",movie);

        Book book = new Book();
        book.setNumPages(450);
        book.setPrice(300);
        book.setTitle("Struggle");

        this.items.put("book",book);
    }
}
