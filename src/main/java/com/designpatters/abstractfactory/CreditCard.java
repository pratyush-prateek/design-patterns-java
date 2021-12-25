package com.designpatters.abstractfactory;

public abstract class CreditCard {
     protected String cardNuber;
     protected String ccNumber;

    public String getCardNuber() {
        return cardNuber;
    }

    public void setCardNuber(String cardNuber) {
        this.cardNuber = cardNuber;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    //can add some abstract methods to be implemented by concrete types, as in simple factory
}
