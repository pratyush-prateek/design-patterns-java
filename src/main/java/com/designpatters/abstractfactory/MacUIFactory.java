package com.designpatters.abstractfactory;

public class MacUIFactory extends UIFactory {
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
