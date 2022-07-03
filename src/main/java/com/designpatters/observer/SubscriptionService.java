package com.designpatters.observer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Common service for publishers and subscribers
//Subscribers have an endpoint to trigger this service to subscribe or unsubcsribe to a publisher
//Create a separate layer for publishers so that they can publish content
public class SubscriptionService {
    private static SubscriptionService instance;
    private PublisherService publisherService;
    private SubscriptionService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    public static SubscriptionService getInstance(PublisherService publisherService) {
        if(SubscriptionService.instance == null) {
            synchronized(SubscriptionService.class) {
                SubscriptionService.instance = new SubscriptionService(publisherService);
            }
        }
        return SubscriptionService.instance;
    }

    public void subscribe(String publisherId, Subscriber subscriber) throws Exception {
        this.publisherService.subscribeToPublisher(publisherId, subscriber);
    }

    public void unsubscribe(String publisherId, Subscriber subscriber) throws Exception {
        this.publisherService.unsubscribeFromPublisher(publisherId, subscriber);
    }
}
