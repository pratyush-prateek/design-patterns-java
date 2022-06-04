package com.designpatters.abstractfactory;

public class MenuItem {
    private String metadata;
    public MenuItem(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
