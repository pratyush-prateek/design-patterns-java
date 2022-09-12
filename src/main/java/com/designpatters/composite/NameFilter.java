package com.designpatters.composite;

public class NameFilter implements Filter{
    private SearchParams searchParams;
    public NameFilter(SearchParams searchParams) {
        this.searchParams = searchParams;
    }
    @Override
    public boolean matches(FileProperties fileProperties) {
        if(this.searchParams.name == null)
            return true;

        return this.searchParams.name.equalsIgnoreCase(fileProperties.name);
    }
}
