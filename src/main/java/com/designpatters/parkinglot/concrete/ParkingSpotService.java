package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.enums.VehicleType;
import com.designpatters.parkinglot.interfaces.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSpotService {
    private static ParkingSpotService instance;
    private Map<VehicleType, List<ParkingSpot>> availableParkingSpots;
    private ParkingSpotService(Map<VehicleType, List<ParkingSpot>> parkingSpots) {
        this.availableParkingSpots = parkingSpots;
    }

    public static ParkingSpotService getInstance(Map<VehicleType,List<ParkingSpot>> parkingSpots) {
        if(ParkingSpotService.instance == null) {
            synchronized(ParkingSpotService.class) {
                ParkingSpotService.instance = new ParkingSpotService(parkingSpots);
            }
        }

        return ParkingSpotService.instance;
    }

    public List<ParkingSpot> getAvailableParkingSpotsForVehicleType(VehicleType vehicleType) {
        return this.availableParkingSpots.get(vehicleType);
    }

    public void addParkingSpotBack(ParkingSpot parkingSpot, VehicleType vehicleType) {
        this.availableParkingSpots.get(vehicleType).add(parkingSpot);
    }

    public void addNewParkingSpot(ParkingSpot parkingSpot, VehicleType vehicleType) {
        this.availableParkingSpots.get(vehicleType).add(parkingSpot);
    }
}
