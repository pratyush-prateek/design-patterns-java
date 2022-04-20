package com.designpatters.builder;

public class Director {
    public static void buildSUVCar(Builder builder) {
        builder.setSeats(4);
        builder.setEngine("Turbo engine");
        builder.setGPS("Bing maps GPS");
    }

    public static void buildSUVCarManual(Builder builder) {
        builder.setSeats(4);
        builder.setEngine("Turbo engine manual");
        builder.setGPS("SUV GPS Manual");
    }

    public static void buildSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine("Superrr");
        builder.setGPS("Azure maps GPS");
    }

    public static void builSportsCarManual(Builder builder) {
        builder.setSeats(2);
        builder.setEngine("Super engine manual");
        builder.setGPS("Sports CAR gps manual");
    }
}
