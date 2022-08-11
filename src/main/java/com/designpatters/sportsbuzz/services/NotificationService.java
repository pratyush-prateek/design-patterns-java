package com.designpatters.sportsbuzz.services;

import com.designpatters.sportsbuzz.concrete.Game;
import com.designpatters.sportsbuzz.interfaces.Subscriber;

import java.util.List;
import java.util.Map;

public class NotificationService {
    public void notifySubscribers(Map<String,Subscriber> subscribers, Game game) {
        for(Subscriber subscriber: subscribers.values())
            subscriber.notify(game);
    }
}
