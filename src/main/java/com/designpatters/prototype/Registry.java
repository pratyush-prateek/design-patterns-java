package com.designpatters.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<String,Item>();
    public Registry() {
        this.loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)(items.get(type).clone());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setDuration(28);
        movie.setRating(8);
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
