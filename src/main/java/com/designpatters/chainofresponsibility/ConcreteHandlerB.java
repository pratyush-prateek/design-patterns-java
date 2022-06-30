package com.designpatters.chainofresponsibility;


//handles payload <=100
public class ConcreteHandlerB extends BaseHandler {
    public ConcreteHandlerB() {

    }
    public void handle(Request request) {
        if(request.getPayload() <= 100)
            System.out.println("Request has been handled by B");
        else if(this.next != null)
            this.next.handle(request);
        else
            System.out.println("Request cannot be handled");
    }
}
