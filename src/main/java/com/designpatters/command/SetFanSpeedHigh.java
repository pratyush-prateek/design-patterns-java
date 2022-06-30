package com.designpatters.command;

public class SetFanSpeedHigh implements Command {
    private Fan fan;
    public SetFanSpeedHigh(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.setFanSpeed(FanSpeed.HIGH);
    }

    @Override
    public void undo() throws Exception {
        this.fan.undoSpeed();
    }

    @Override
    public String toString() {
        return "SetFanSpeedHigh{" +
                "fan=" + fan.toString() +
                '}';
    }
}
