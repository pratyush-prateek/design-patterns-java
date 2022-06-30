package com.designpatters.bridge;

public interface Device {
    void setChannel(int number);
    int getChannel();
    int getVolume();
    void setVolume(int number);
    void toggleDevice();
}
