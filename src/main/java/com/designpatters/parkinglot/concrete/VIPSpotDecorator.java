package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.interfaces.Tariff;

public class VIPSpotDecorator extends BaseTariffDecorator {
    private final int VIP_SPOT_CHARGE = 20;
    public VIPSpotDecorator(Tariff wrappedTariff) {
        super(wrappedTariff);
    }

    @Override
    public int getBaseTariff() {
        return super.getBaseTariff();
    }

    @Override
    public int getAdditionalTariff() {
        return super.getAdditionalTariff() + this.VIP_SPOT_CHARGE;
    }
}
