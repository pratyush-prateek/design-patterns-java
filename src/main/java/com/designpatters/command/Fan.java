package com.designpatters.command;

public class Fan {
    private DeviceState state;
    private FanSpeed fanSpeed;
    private FanSpeed previousSpeed;
    private DeviceState previousState;
    public Fan() {
        this.state = DeviceState.OFF;
    }

    public void toggleState() {
        this.previousState = this.state;
        this.state = this.state == DeviceState.ON? DeviceState.OFF: DeviceState.ON;
    }

    public void setFanSpeed(FanSpeed fanSpeed) {
        this.previousSpeed = this.fanSpeed;
        this.fanSpeed = fanSpeed;
    }

    public void undoState() throws Exception {
        if(this.previousState == null)
            throw new Exception("Nothing to undo");

        this.state = this.previousState;
        this.previousState = null;
    }

    public void undoSpeed() throws Exception {
        if(this.previousSpeed == null)
            throw new Exception("Nothing to undo");

        this.fanSpeed = this.previousSpeed;
        this.previousSpeed = null;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "state=" + state +
                ", fanSpeed=" + fanSpeed +
                ", previousSpeed=" + previousSpeed +
                ", previousState=" + previousState +
                '}';
    }
}
