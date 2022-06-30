package com.designpatters.command;

public class ToggleFanCommand implements Command {
    private Fan fan;
    public ToggleFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.toggleState();
    }

    @Override
    public void undo() throws Exception {
        this.fan.undoState();
    }

    @Override
    public String toString() {
        return "ToggleFanCommand{" +
                "fan=" + fan.toString() +
                '}';
    }
}
