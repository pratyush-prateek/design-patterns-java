package com.designpatters.prototype;

public class Book extends Product{
    private int numberOfPages;
    private String author;
    public Book() {}
    public Book(Book source) {
        super(source);
        this.numberOfPages = source.numberOfPages;
        this.author = source.author;
    }

    public Product clone() {
        return new Book(this);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
