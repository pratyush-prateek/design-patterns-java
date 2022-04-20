package com.designpatters.builder;

public class CarManualBuilder implements Builder {
    private CarManual carManual;
    public CarManualBuilder() {
        this.reset();
    }
    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setSeats(int seats) {
        this.carManual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.carManual.setEngineManual(engine);
    }

    @Override
    public void setGPS(String gps) {
        this.carManual.setGpsManual(gps);
    }

    public CarManual getProduct() {
        CarManual product = this.carManual;
        this.reset();
        return product;
    }
}
