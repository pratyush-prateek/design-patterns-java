package com.designpatters.observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        //Creating publishers
        List<Publisher> publishers = new ArrayList<>();
        publishers.add(new Publisher("A"));
        publishers.add(new Publisher("B"));
        publishers.add(new Publisher("C"));

        //Creating publisher and subscriber services
        PublisherService publisherService = PublisherService.getInstance(publishers);
        SubscriptionService subscriptionService = SubscriptionService.getInstance(publisherService);

        //Creating subscribers
        Subscriber subscriberA = new MessageSubscriber("S_1", subscriptionService);
        Subscriber subscriberB = new MessageSubscriber("S_2", subscriptionService);
        Subscriber subscriberC = new MessageSubscriber("S_3", subscriptionService);
        Subscriber subscriberD = new MessageSubscriber("S_4", subscriptionService);

        //Publisher A publishes a new content
        publisherService.publishNewContent("A", "New message from A");

        //Publisher B publishes a new content
        publisherService.publishNewContent("B", "New message from B");

        //Subscriber A subscribers to A, B C
        //Subscriber B subscribers to B, C
        //Subscriber D subscribes to C
        subscriberA.subscribe("A");
        subscriberA.subscribe("B");
        subscriberA.subscribe("C");
        subscriberB.subscribe("B");
        subscriberB.subscribe("C");
        subscriberD.subscribe("C");

        //Publisher A publishes new content
        publisherService.publishNewContent("A","Another message from A" );

        //Publisher B publishes new content
        publisherService.publishNewContent("B", "Another new message from B");

        //Publisher C publishes new content
        publisherService.publishNewContent("C", "Another message from C");




    }
}
