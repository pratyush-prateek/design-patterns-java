package com.designpatters.observer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublisherService {
    private Map<String,Publisher> publisherMap;
    private static PublisherService instance;
    private PublisherService(List<Publisher> publishers) {
        this.publisherMap = new HashMap<>();
        for(Publisher publisher: publishers)
            this.publisherMap.put(publisher.getPublisherId(),publisher);
    }

    public static PublisherService getInstance(List<Publisher> publishers) {
        if(PublisherService.instance == null) {
            synchronized(PublisherService.class) {
                PublisherService.instance = new PublisherService(publishers);
            }
        }

        return PublisherService.instance;
    }

    public void subscribeToPublisher(String publisherId, Subscriber subscriber)throws Exception {
        Publisher publisher = this.publisherMap.get(publisherId);

        if(publisher == null)
            throw new NullPointerException();

        publisher.addSubscribers(subscriber);
    }

    public void unsubscribeFromPublisher(String publisherId, Subscriber subscriber) throws Exception {
        Publisher publisher = this.publisherMap.get(publisherId);

        if(publisher == null)
            throw new NullPointerException();

        publisher.removeSubscribers(subscriber);
    }

    public void publishNewContent(String publisherId, String message) throws Exception {
        Publisher publisher = this.publisherMap.get(publisherId);

        if(publisher == null)
            throw new NullPointerException();

        publisher.publishNewContent(new Notification(message));
    }
}
