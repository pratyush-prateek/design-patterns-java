package com.designpatters.abstractfactory;

import java.util.List;

public class WindowsCheckBox implements Checkbox {
    @Override
    public void render(List<Option> options) {
        StringBuilder optionStr = new StringBuilder();
        System.out.println("----------WINDOWS------------");
        for(Option option: options) {
            optionStr.append(option.getMetadata());
            optionStr.append("\n");
        }

        System.out.println(optionStr.toString());
    }
}
