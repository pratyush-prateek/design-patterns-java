package com.designpatters.bridge;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer {
    private Book book;
    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    public String getHeader() {
        return book.getTitle();
    }

    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Pages", book.getNumPages()));
        details.add(new Detail("Author", book.getAuthor()));
        details.add(new Detail("Rating",book.getRating()));
        return details;
    }
}
