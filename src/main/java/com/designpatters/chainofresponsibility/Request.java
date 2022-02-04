package com.designpatters.chainofresponsibility;

public class Request {
    private int amount;
    private RequestType requestType;

    public Request(int amount, RequestType requestType) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
