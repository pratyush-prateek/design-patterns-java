package com.designpatters.immutablechainofresponsibility;

public class ConcreteHandlerC extends BaseHandler {
    public ConcreteHandlerC(){ }
    public ConcreteHandlerC(Handler next) throws Exception {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if(request.getPayload() <= 200)
            System.out.println("Request has been handled at C");
        else if(this.next != null)
            this.next.handle(request);
        else
            System.out.println("Request could not be handled");
    }
}
