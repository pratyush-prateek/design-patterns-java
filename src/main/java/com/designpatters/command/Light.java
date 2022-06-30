package com.designpatters.command;

public class Light {
    private DeviceState state;
    private DeviceState previousState;
    public Light() {
        this.state = DeviceState.OFF;
    }

    public void toggle() {
        this.previousState = this.state;
        this.state = this.state == DeviceState.ON? DeviceState.OFF: DeviceState.ON;
    }

    public void undo() throws Exception {
        if(previousState == null)
            throw new Exception("There is nothing to undo");

        this.state = this.previousState;
        this.previousState = null;
    }

    @Override
    public String toString() {
        return "Light{" +
                "state=" + state +
                ", previousState=" + previousState +
                '}';
    }
}
