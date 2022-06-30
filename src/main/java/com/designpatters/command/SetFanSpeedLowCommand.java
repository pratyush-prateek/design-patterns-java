package com.designpatters.command;

public class SetFanSpeedLowCommand implements Command {
    private Fan fan;
    public SetFanSpeedLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.setFanSpeed(FanSpeed.LOW);
    }

    @Override
    public void undo() throws Exception {
        this.fan.undoSpeed();
    }

    @Override
    public String toString() {
        return "SetFanSpeedLowCommand{" +
                "fan=" + fan.toString() +
                '}';
    }
}
