package com.designpatters.abstractfactory;

public class WindowsUIFactory extends UIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
