package com.designpatters.bridge;

public class Client {
    public static void main(String[] args) {
        //Sample objects
        Movie movie = new Movie();
        movie.setName("Sherlock holmes");
        movie.setClassification("Action");
        movie.setRuntime("180 mins");
        movie.setRating("8/10");

        Book book = new Book();
        book.setAuthor("R Stevenson");
        book.setTitle("The river");
        book.setRating("9/10");
        book.setNumPages("250");

        //Printers for this
        Printer moviePrinter = new MoviePrinter(movie);
        Printer bookPrinter = new BookPrinter(book);

        //Printing movie in different formats
        System.out.println(moviePrinter.print(new NormalFormatter()));
        System.out.println(moviePrinter.print(new CsvFormatter()));

        //Printing book in different formats
        System.out.println(bookPrinter.print(new NormalFormatter()));
        System.out.println(bookPrinter.print(new CsvFormatter()));

    }
}
