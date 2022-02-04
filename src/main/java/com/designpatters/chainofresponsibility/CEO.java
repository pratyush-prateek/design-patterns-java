package com.designpatters.chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can handle any requests");
    }
}
