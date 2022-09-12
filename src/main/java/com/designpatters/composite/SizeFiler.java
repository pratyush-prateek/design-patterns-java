package com.designpatters.composite;

public class SizeFiler implements Filter{
    private SearchParams searchParams;
    public SizeFiler(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    @Override
    public boolean matches(FileProperties fileProperties) {
        if(this.searchParams.size == null)
            return true;

        return this.searchParams.size.equals(fileProperties.size);
    }
}
