package com.designpatters.immutablechainofresponsibility;

public class Request {
    private int payload;
    public Request(int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }
}
