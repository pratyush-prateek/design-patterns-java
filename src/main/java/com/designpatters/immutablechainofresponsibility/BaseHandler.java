package com.designpatters.immutablechainofresponsibility;

public abstract class BaseHandler implements Handler {
    protected Handler next;
    public BaseHandler() {}
    public BaseHandler(Handler next) throws Exception {
        if(this == next)
            throw new Exception("Handlers cannot be chained in cycles");
        this.next = next;
    }

    //Common code for all handlers
}
