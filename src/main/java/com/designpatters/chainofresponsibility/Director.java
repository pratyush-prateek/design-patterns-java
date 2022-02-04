package com.designpatters.chainofresponsibility;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE && request.getAmount()<=1000)
            System.out.println("Director can handle conferences which are upto 1k");

        else
            successor.handleRequest(request);
    }
}
