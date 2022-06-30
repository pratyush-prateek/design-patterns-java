package com.designpatters.chainofresponsibility;

public interface Handler {
    void handle(Request request);
    void setNext(Handler next) throws Exception;
}
