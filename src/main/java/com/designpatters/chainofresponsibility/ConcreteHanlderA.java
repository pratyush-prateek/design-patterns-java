package com.designpatters.chainofresponsibility;

//handles payload<=50
public class ConcreteHanlderA extends BaseHandler {
    public ConcreteHanlderA() {

    }
    @Override
    public void handle(Request request) {
        if(request.getPayload() <= 50)
            System.out.println("Request handled by A");
        else if(this.next != null)
            this.next.handle(request);
        else
            System.out.println("Request could not be handled");
    }
}
