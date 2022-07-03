package com.designpatters.observer;

public interface Subscriber {
    void update(Notification notification);
    void subscribe(String publisherId) throws Exception;
    void unsubscribe(String publisherId) throws Exception;
}
