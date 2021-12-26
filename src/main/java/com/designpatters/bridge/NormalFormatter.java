package com.designpatters.bridge;

import java.util.List;

public class NormalFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("Header: ");
        builder.append(header);
        builder.append("\n");
        for(Detail detail: details) {
            builder.append(detail.getLabel() + ":" + detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
