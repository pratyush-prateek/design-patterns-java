package com.designpatters.chainofresponsibility;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.ORDER && request.getAmount()<=1500)
            System.out.println("VP can hanlder order requests upto 1500");
        else
            successor.handleRequest(request);
    }
}
