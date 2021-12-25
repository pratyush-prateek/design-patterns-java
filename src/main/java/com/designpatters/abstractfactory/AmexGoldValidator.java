package com.designpatters.abstractfactory;

public class AmexGoldValidator extends Validator {
    @Override
    public boolean validateCreditCard() {
        return true;
    }
}
