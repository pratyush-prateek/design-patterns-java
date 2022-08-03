package com.designpatters.parkinglot.interfaces;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpots);
}
