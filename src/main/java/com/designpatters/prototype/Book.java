package com.designpatters.prototype;

public class Book extends Product {
    private int numPages;
    public Book(){}
    public Book(Book source) {
        super(source);
        this.numPages = source.getNumPages();
    }
    @Override
    public Product clone() {
        return new Book(this);
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
