package com.designpatters.abstractfactory;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch(cardType) {
            case GOLD:
                return new AmexGold();
            case PLATINUM:
                return new AmexPlatinum();
        }
        return null;
    }

    @Override
    public Validator getCreditCardValidator(CardType cardType) {
        switch(cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
