package com.designpatters.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class MetadataService {
    public static List<Option> getOptions() {
        List<Option> options = new ArrayList<Option>();
        options.add(new Option("Option 1"));
        options.add(new Option("Option 2"));
        return options;
    }

    public static List<MenuItem> getMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Menu item 1"));
        menuItems.add(new MenuItem("Menu item 2"));
        return menuItems;
    }
}
