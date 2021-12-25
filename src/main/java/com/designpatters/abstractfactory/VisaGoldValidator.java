package com.designpatters.abstractfactory;

public class VisaGoldValidator extends Validator{

    //Can contain other implementation of this validator
    @Override
    public boolean validateCreditCard() {
        return true;
    }
}
