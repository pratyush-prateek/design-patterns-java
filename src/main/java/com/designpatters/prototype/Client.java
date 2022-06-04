package com.designpatters.prototype;

public class Client {
    public static void main(String args[])throws Exception {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("movie");
        movie.setTitle("NEW");
        System.out.println(movie.toString());
    }
}
