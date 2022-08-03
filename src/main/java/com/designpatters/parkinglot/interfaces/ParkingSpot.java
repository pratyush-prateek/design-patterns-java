package com.designpatters.parkinglot.interfaces;

import com.designpatters.parkinglot.enums.AdditionalServiceType;
import com.designpatters.parkinglot.exceptions.ServiceNotSupportedException;

public interface ParkingSpot {
    public void lockParkingSpot();
    public void resetParkingSpot();
    public void additionalServices(AdditionalServiceType serviceType);
    public double getTotalTariff(long timeInMilliseconds);
}
