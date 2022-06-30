package com.designpatters.command;

public class ToggleLightCommand implements Command {
    private Light light;
    public ToggleLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.toggle();
    }

    @Override
    public void undo() throws Exception {
        this.light.undo();
    }

    @Override
    public String toString() {
        return "ToggleLightCommand{" +
                "light=" + light.toString() +
                '}';
    }
}
