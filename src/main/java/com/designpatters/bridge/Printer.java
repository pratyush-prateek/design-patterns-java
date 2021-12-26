package com.designpatters.bridge;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    public abstract String getHeader();
    public abstract List<Detail> getDetails();
}
