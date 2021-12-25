package com.designpatters.prototype;

public class Book extends Item {
    private int numPages;

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
