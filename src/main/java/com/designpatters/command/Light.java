package com.designpatters.command;

public class Light {
    private boolean isOn = false;
    public void toggle() {
        if(isOn) {
            this.off();
            isOn = false;
        }
        else {
            this.on();
            isOn = true;
        }
    }
    public boolean isOn() {
        return isOn;
    }
    private void on() {
        System.out.println("Light on");
    }

    private void off() {
        System.out.println("Light off");
    }
}
