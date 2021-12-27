package com.designpatters.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder();
        builder.append(menuComponent.getUrl());
        return builder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not supported");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not supported");
    }

    public abstract String toString();
}
