package com.designpatters.abstractfactory;

public class VisaPlatinumValidator extends Validator {
    @Override
    public boolean validateCreditCard() {
        return true;
    }
}
