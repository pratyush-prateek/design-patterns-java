package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.enums.AdditionalServiceType;
import com.designpatters.parkinglot.exceptions.ServiceNotSupportedException;
import com.designpatters.parkinglot.interfaces.ParkingSpot;
import com.designpatters.parkinglot.interfaces.Tariff;

public class ConcreteParkingSpot implements ParkingSpot {
    private boolean locked;
    private Tariff tariff;
    private int baseTariff;
    public ConcreteParkingSpot(int baseTariff) {
        this.locked = false;
        this.tariff = new BaseTariff(baseTariff);
        this.baseTariff = baseTariff;
    }

    @Override
    public void lockParkingSpot() {
        this.locked = true;
    }

    @Override
    public void resetParkingSpot() {
        this.locked = false;
        this.tariff = new BaseTariff(this.baseTariff);
    }

    @Override
    public void additionalServices(AdditionalServiceType serviceType) {
        switch (serviceType) {
            case EV:
                this.tariff = new EVServiceDecorator(this.tariff);
                break;
            case VIP:
                this.tariff = new VIPSpotDecorator(this.tariff);
                break;
            case CLEANING:
                this.tariff = new CleaningServiceDecorator(this.tariff);
                break;
            default:
                throw new ServiceNotSupportedException("The service is not supported");
        }
    }

    @Override
    public double getTotalTariff(long timeInMilliseconds) {
        int baseTariff = this.tariff.getBaseTariff();
        int additionalServiceCharge = this.tariff.getAdditionalTariff();
        double timeInHours = timeInMilliseconds/(1000*60*60.0);
        return timeInHours*baseTariff + additionalServiceCharge;
    }
}
