package com.designpatters.composite;

public class AndFilter implements Filter{
    private Filter filter1;
    private Filter filter2;
    public AndFilter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public boolean matches(FileProperties fileProperties) {
        return filter1.matches(fileProperties) && filter2.matches(fileProperties);
    }
}
