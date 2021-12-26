package com.designpatters.bridge;

import java.util.List;

public class CsvFormatter implements Formatter{
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("Header: " +header);
        builder.append(",");
        for(Detail detail: details) {
            builder.append(detail.getLabel() + ":" + detail.getValue() + ",");
        }
        return builder.toString();
    }
}
