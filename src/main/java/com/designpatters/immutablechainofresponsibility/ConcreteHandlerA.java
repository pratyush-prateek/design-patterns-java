package com.designpatters.immutablechainofresponsibility;

public class ConcreteHandlerA extends BaseHandler {
    public ConcreteHandlerA(){}
    public ConcreteHandlerA(Handler next) throws Exception {
        super(next);
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
