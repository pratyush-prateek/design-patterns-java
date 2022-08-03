package com.designpatters.parkinglot;

import com.designpatters.parkinglot.concrete.ConcreteParkingSpot;
import com.designpatters.parkinglot.concrete.ParkingLot;
import com.designpatters.parkinglot.concrete.ParkingTicket;
import com.designpatters.parkinglot.enums.AdditionalServiceType;
import com.designpatters.parkinglot.enums.ParkingStrategyType;
import com.designpatters.parkinglot.enums.PaymentStrategyType;
import com.designpatters.parkinglot.enums.VehicleType;
import com.designpatters.parkinglot.interfaces.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String args[]) throws Exception {
        //Configure parking spots
        ParkingSpot smallSpot1 = new ConcreteParkingSpot(10);
        ParkingSpot medSpot1 = new ConcreteParkingSpot(15);
        ParkingSpot medSpot2 = new ConcreteParkingSpot(15);
        ParkingSpot largeSpot1 = new ConcreteParkingSpot(20);
        ParkingSpot largeSpot2 = new ConcreteParkingSpot(20);
        Map<VehicleType, List<ParkingSpot>> parkingSpots = new HashMap<>();
        parkingSpots.put(VehicleType.SMALL, new ArrayList());
        parkingSpots.put(VehicleType.MEDIUM, new ArrayList());
        parkingSpots.put(VehicleType.LARGE, new ArrayList());
        parkingSpots.get(VehicleType.SMALL).add(smallSpot1);
        parkingSpots.get(VehicleType.MEDIUM).add(medSpot1);
        parkingSpots.get(VehicleType.MEDIUM).add(medSpot2);
        parkingSpots.get(VehicleType.LARGE).add(largeSpot1);
        parkingSpots.get(VehicleType.LARGE).add(largeSpot2);

        //Create parking lot instance
        ParkingLot parkingLot = ParkingLot.getInstance(parkingSpots);


        //Small vehicle
        ParkingTicket smallParkingTicket = parkingLot.getParkingTicket("PPSHY", VehicleType.SMALL, ParkingStrategyType.RANDOM);
        //Another small vehicle, No small space available
        ParkingTicket smallParkingTicket2 = parkingLot.getParkingTicket("ABCDF", VehicleType.SMALL, ParkingStrategyType.RANDOM);

        //A large vehicle
        ParkingTicket largeParkingTicket = parkingLot.getParkingTicket("ABBHJK", VehicleType.LARGE, ParkingStrategyType.RANDOM);


        //Avail special services
        smallParkingTicket.useAdditionalService(AdditionalServiceType.CLEANING);
        smallParkingTicket.useAdditionalService(AdditionalServiceType.VIP);
        largeParkingTicket.useAdditionalService(AdditionalServiceType.CLEANING);
        largeParkingTicket.useAdditionalService(AdditionalServiceType.EV);

        //Exit parking lot, mimick this execution using ScheduledExecutorService maybe?
        //For executing this in future to mimick time spent in garage
        //But our parking lot instance is not thread safe :)
        //Will work on creating a thread safe parking lot later
        parkingLot.exitParkingLot("PPSHY", PaymentStrategyType.CREDIT_CARD);
        parkingLot.exitParkingLot("ABBHJK", PaymentStrategyType.PAYPAL);
    }
}
