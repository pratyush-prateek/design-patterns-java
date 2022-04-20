package com.designpatters.builder;

public class CarManual {
    private int seats;
    private String engineManual;
    private String gpsManual;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngineManual() {
        return engineManual;
    }

    public void setEngineManual(String engineManual) {
        this.engineManual = engineManual;
    }

    public String getGpsManual() {
        return gpsManual;
    }

    public void setGpsManual(String gpsManual) {
        this.gpsManual = gpsManual;
    }
}
