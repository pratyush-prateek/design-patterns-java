package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.interfaces.Tariff;

public class BaseTariffDecorator implements Tariff {
    private Tariff wrappedTariff;
    public BaseTariffDecorator(Tariff wrappedTariff) {
        this.wrappedTariff = wrappedTariff;
    }

    @Override
    public int getBaseTariff() {
        return this.wrappedTariff.getBaseTariff();
    }

    @Override
    public int getAdditionalTariff() {
        return this.wrappedTariff.getAdditionalTariff();
    }
}
