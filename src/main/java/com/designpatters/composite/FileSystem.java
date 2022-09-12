package com.designpatters.composite;

import java.util.List;

public interface FileSystem {
    public int getSize();
    public boolean isDirectory();
    public List<FileSystem> getMatches(Filter filter);
}
