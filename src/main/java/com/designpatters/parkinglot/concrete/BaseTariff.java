package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.interfaces.Tariff;

public class BaseTariff implements Tariff {
    private int price;
    public BaseTariff(int price) {
        this.price = price;
    }

    @Override
    public int getBaseTariff() {
        return this.price;
    }

    @Override
    public int getAdditionalTariff() {
        return 0;
    }
}
