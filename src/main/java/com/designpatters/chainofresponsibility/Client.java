package com.designpatters.chainofresponsibility;

public class Client {
    public static void main(String args[]) throws Exception {
        Handler A = new ConcreteHanlderA();
        Handler B = new ConcreteHandlerB();
        Handler C = new ConcreteHandlerC();

        A.setNext(B);
        B.setNext(C);

        //Requests
        Request r1 = new Request(50);
        Request r2 = new Request(100);
        Request r3 = new Request(150);
        Request r4 = new Request(250);

        A.handle(r1);
        A.handle(r2);
        A.handle(r3);
        A.handle(r4);
    }
}
