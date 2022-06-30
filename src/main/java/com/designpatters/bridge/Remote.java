package com.designpatters.bridge;

public abstract class Remote {
    protected Device device;
    public Remote(Device device) {
        this.device = device;
    }

    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
    }

    public void volumeDown() {
        if(this.device.getVolume() == 0)
            return;

        this.device.setVolume(this.device.getVolume() - 1);
    }

    public void channelUp() {
        this.device.setChannel(this.device.getChannel()+1);
    }

    public void channelDown() {
        this.device.setChannel(this.device.getChannel()-1);
    }

    public void toggleDevice() {
        this.device.toggleDevice();
    }
}


