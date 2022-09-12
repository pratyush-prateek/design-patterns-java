package com.designpatters.composite;

public class FileProperties {
    String name;
    String extension;
    int size;

    @Override
    public String toString() {
        return "Filename: " + name + "\n" + "extension: " + extension + "\n" + "Size: " + size + "\n";
    }
}
