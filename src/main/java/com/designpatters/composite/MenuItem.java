package com.designpatters.composite;

public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return this.print(this);
    }
}
