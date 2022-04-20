package com.designpatters.builder;

public class Client {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        Builder manualBuilder = new CarManualBuilder();
        Director.buildSUVCar(carBuilder);
        Car suvCar = carBuilder.getProduct();
        Director.buildSUVCarManual(carManualBuilder);
        CarManual suvCarManual = carManualBuilder.getProduct();
    }
}
