package com.designpatters.abstractfactory;

import java.util.List;

public class MacMenu implements Menu {
    @Override
    public void openMenu(List<MenuItem> menuItems) {
        StringBuilder menu = new StringBuilder();
        menu.append("----MAC-----");
        for(MenuItem menuItem: menuItems) {
            menu.append(menuItem.getMetadata());
            menu.append("\n");
        }
        System.out.println(menu.toString());
    }
}
