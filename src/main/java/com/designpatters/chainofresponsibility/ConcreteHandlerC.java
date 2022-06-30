package com.designpatters.chainofresponsibility;

//payload <= 200
public class ConcreteHandlerC extends BaseHandler {
    public ConcreteHandlerC() {}
    public void handle(Request request) {
        if(request.getPayload() <= 200)
            System.out.println("Request has been handled at C");
        else if(this.next != null)
            this.next.handle(request);
        else
            System.out.println("Request could not be handled");
    }
}
