package com.designpatters.command;

import java.util.List;

public class TurnAllOffCommand implements Command {
    private List<Light> lights;
    public TurnAllOffCommand(List<Light> lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        for(Light light: this.lights) {
            if(light.isOn())
                light.toggle();
        }
    }
}
