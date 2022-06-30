package com.designpatters.chainofresponsibility;

public abstract class BaseHandler implements Handler {
    protected Handler next;
    @Override
    public void setNext(Handler next) throws Exception {
        if(next == this)
            throw new Exception("Handlers cannot be chained as cycles");

        this.next = next;
    }
}
