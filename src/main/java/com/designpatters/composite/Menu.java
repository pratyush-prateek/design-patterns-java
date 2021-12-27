package com.designpatters.composite;

import java.util.Iterator;

//A composite menu consisting of manu item(s) or other menu(s)
public class Menu extends MenuComponent{
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.print(this));

        Iterator<MenuComponent> itr = menuComponents.iterator();
        while(itr.hasNext()) {
            builder.append(itr.next().toString());
            builder.append("\n");
            builder.append("\t");
        }

        return builder.toString();
    }
}
