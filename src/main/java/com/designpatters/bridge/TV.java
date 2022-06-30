package com.designpatters.bridge;

public class TV implements Device {
    private int channel;
    private int volume;
    private boolean on;
    public TV() {
        this.channel = 0;
        this.volume = 0;
        this.on = true;
    }
    @Override
    public void setChannel(int number) {
        this.channel = number;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int number) {
        this.volume = number;
    }

    @Override
    public void toggleDevice() {
        this.on = !this.on;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", on=" + on +
                '}';
    }
}
