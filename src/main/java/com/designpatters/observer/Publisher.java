package com.designpatters.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;
    private String publisherId;
    public Publisher(String publisherId) {
        this.publisherId = publisherId;
        this.subscribers = new ArrayList<Subscriber>();
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void addSubscribers(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscribers(Subscriber subscriber) throws Exception {
        if(this.subscribers.size() == 0)
            throw new Exception("No subscriber found to remove");

        this.subscribers.remove(subscriber);
    }

    public void publishNewContent(Notification notification) {
        for(Subscriber subscriber: this.subscribers) {
            subscriber.update(notification);
        }
    }
}
