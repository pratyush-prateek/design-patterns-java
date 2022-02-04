package com.designpatters.chainofresponsibility;

public class Runner {
    public static void main(String[] args) {
        //Setting up chains
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(500, RequestType.CONFERENCE);
        Request request2 = new Request(1500, RequestType.ORDER);
        Request request3 = new Request(2000, RequestType.ORDER);
        Request request4 = new Request(2000, RequestType.CONFERENCE);

        //Handling requests
        director.handleRequest(request1);
        director.handleRequest(request2);
        director.handleRequest(request3);
        director.handleRequest(request4);
    }
}
