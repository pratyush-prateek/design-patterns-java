package com.designpatters.prototype;

public class Client {
    public static void main(String[] args)throws Exception {
        RegistryService registryService = new RegistryService();
        Book book = (Book)registryService.createProduct(ProductType.BOOK);
        Movie movie = (Movie)registryService.createProduct(ProductType.MOVIE);
        System.out.println(book.toString());
        System.out.println(movie.toString());
    }
}
