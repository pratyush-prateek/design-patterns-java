package com.designpatters.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File implements FileSystem{
    private FileProperties fileProperties;
    public File(String name, String extension, int size) {
        fileProperties = new FileProperties();
        fileProperties.name = name;
        fileProperties.extension = extension;
        fileProperties.size = size;
    }

    @Override
    public int getSize() {
        return this.fileProperties.size;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public List<FileSystem> getMatches(Filter filter) {
        if(filter.matches(this.fileProperties))
            return Arrays.asList(new FileSystem[]{this});
        else return new ArrayList<>();
    }

    @Override
    public String toString() {
        return fileProperties.toString();
    }
}
