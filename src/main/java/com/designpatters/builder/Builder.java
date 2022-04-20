package com.designpatters.builder;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setGPS(String gps);
}
