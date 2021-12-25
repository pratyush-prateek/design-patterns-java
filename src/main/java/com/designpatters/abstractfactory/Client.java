package com.designpatters.abstractfactory;

public class Client {
    public static void main(String args[]) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(774);
        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);
        Validator validator1 = abstractFactory.getCreditCardValidator(CardType.GOLD);

        System.out.println(abstractFactory.getClass());
        System.out.println(card1.getClass());
        System.out.println(validator1.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(356);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.PLATINUM);
        Validator validator2 = abstractFactory.getCreditCardValidator(CardType.PLATINUM);

        System.out.println("Checking next use case");
        System.out.println(abstractFactory.getClass());
        System.out.println(card2.getClass());
        System.out.println(validator2.getClass());
    }
}
