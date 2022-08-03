package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.interfaces.ParkingSpot;
import com.designpatters.parkinglot.interfaces.ParkingStrategy;

import java.util.List;
import java.util.Random;

public class RandomParkingStrategy implements ParkingStrategy {
    private Random random;
    public RandomParkingStrategy(){
        this.random = new Random();
    }

    @Override
    public ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpots) {
        if(parkingSpots.size() == 0)
            return null;

        int randomIndex = this.random.nextInt(parkingSpots.size());
        ParkingSpot parkingSpot = parkingSpots.get(randomIndex);
        parkingSpots.remove(parkingSpot);
        return parkingSpot;
    }
}
