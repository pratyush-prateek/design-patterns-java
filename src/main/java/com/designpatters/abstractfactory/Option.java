package com.designpatters.abstractfactory;

public class Option {
    private String metadata;
    public Option(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
