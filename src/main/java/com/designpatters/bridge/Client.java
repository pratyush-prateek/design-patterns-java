package com.designpatters.bridge;

public class Client {
    public static void main(String[] args)throws Exception {
        Device tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        System.out.println(tv);
        remote.volumeUp();
        System.out.println(tv);
        remote.toggleDevice();
        System.out.println(tv);
    }
}
