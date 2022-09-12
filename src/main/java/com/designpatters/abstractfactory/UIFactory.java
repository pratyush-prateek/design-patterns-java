package com.designpatters.abstractfactory;

import java.util.List;

public abstract class UIFactory {
    public void renderCheckbox(List<Option> options) {
        Checkbox checkbox = createCheckbox();
        checkbox.render(options);
    }

    public void renderMenu(List<MenuItem> items) {
        Menu menu = createMenu();
        menu.openMenu(items);
    }

    public abstract Checkbox createCheckbox();
    public abstract Menu createMenu();
}
