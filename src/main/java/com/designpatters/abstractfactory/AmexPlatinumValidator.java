package com.designpatters.abstractfactory;

public class AmexPlatinumValidator extends Validator {
    @Override
    public boolean validateCreditCard() {
        return true;
    }
}
