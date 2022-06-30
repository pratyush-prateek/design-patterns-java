package com.designpatters.command;

public class SetFanSpeedMediumCommand implements Command {
    private Fan fan;
    public SetFanSpeedMediumCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.setFanSpeed(FanSpeed.MEDIUM);
    }

    @Override
    public void undo() throws Exception {
        this.fan.undoSpeed();
    }

    @Override
    public String toString() {
        return "SetFanSpeedMediumCommand{" +
                "fan=" + fan.toString() +
                '}';
    }
}
