package com.designpatters.observer;

public class MessageSubscriber implements Subscriber {
    private SubscriptionService pubSubService;
    private String subscriberId;
    public MessageSubscriber(String subscriberId, SubscriptionService pubSubService) {
        this.subscriberId = subscriberId;
        this.pubSubService = pubSubService;
    }
    @Override
    public void update(Notification notification) {
        System.out.println("Subscriber notified");
        System.out.println("Subscriber ID:" + subscriberId);
        System.out.println(notification.toString());
    }

    @Override
    public void subscribe(String publisherId) throws Exception{
        this.pubSubService.subscribe(publisherId, this);
    }

    @Override
    public void unsubscribe(String publisherId) throws Exception {
        this.pubSubService.unsubscribe(publisherId, this);
    }
}
