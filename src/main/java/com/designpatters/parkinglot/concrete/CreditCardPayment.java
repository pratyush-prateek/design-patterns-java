package com.designpatters.parkinglot.concrete;

import com.designpatters.parkinglot.interfaces.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        //Actual code for processing this payment through credit card
        System.out.println("Payment processed by credit card for amount: " + amount);
    }
}
