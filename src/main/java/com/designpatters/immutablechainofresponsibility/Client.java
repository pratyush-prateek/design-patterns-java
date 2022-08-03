package com.designpatters.immutablechainofresponsibility;


public class Client {
    public static void main(String[] args) throws Exception {
        Handler chain = new ConcreteHandlerA(new ConcreteHandlerB(new ConcreteHandlerC()));

        //Requests
        Request r1 = new Request(50);
        Request r2 = new Request(100);
        Request r3 = new Request(150);
        Request r4 = new Request(250);

        //Handling requests
        chain.handle(r1);
        chain.handle(r2);
        chain.handle(r3);
        chain.handle(r4);
    }
}
