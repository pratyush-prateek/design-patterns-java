package com.designpatters.command;

import java.util.List;

public class TurnAllOnCommand implements Command {
    private List<Light> lights;
    public TurnAllOnCommand(List<Light> lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        for(Light light: this.lights) {
            if(!light.isOn())
                light.toggle();
        }
    }
}
