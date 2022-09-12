package com.designpatters.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private List<FileSystem> files;
    public Directory() {
        files = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fs) {
        this.files.add(fs);
    }
    @Override
    public int getSize() {
        int size = 0;
        for(FileSystem fs: files)
            size += fs.getSize();

        return size;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public List<FileSystem> getMatches(Filter filter) {
        List<FileSystem> matches = new ArrayList<>();
        for(FileSystem fs: files) {
            matches.addAll(fs.getMatches(filter));
        }

        return matches;
    }
}
