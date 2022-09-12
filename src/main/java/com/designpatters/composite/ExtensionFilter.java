package com.designpatters.composite;

public class ExtensionFilter implements Filter{
    private SearchParams searchParams;
    public ExtensionFilter(SearchParams searchParams) {
        this.searchParams = searchParams;
    }
    @Override
    public boolean matches(FileProperties fileProperties) {
        if(this.searchParams.extension == null)
            return true;

        return this.searchParams.extension.equalsIgnoreCase(fileProperties.extension);
    }
}
