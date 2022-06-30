package com.designpatters.chainofresponsibility;

public class Request {
    private int payload;
    public Request(int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return this.payload;
    }
}
