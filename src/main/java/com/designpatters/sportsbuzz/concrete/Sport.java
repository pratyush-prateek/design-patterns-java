package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.GameStatus;
import com.designpatters.sportsbuzz.enums.ScoreDescriptor;
import com.designpatters.sportsbuzz.interfaces.Subscriber;
import com.designpatters.sportsbuzz.services.NotificationService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Sport {
    protected String name;
    protected String id;
    protected Map<String,Game> games;
    protected Map<String,Subscriber> subscribers;
    protected NotificationService notificationService;
    public Sport(String name, String id, NotificationService notificationService) {
        this.name = name;
        this.id = id;
        this.games = new HashMap<>();
        this.notificationService = notificationService;
        this.subscribers = new HashMap<>();
    }

    public void updateGameStatus(String gameId, GameStatus gameStatus) {
        this.games.get(gameId).setGameStatus(gameStatus);
        this.notificationService.notifySubscribers(this.subscribers, this.games.get(gameId));
    }
    public void updateScoreBoard(String gameId, Participant participant, ScoreDescriptor descriptor, int newValue) {
        this.games.get(gameId).updateScoreBoard(participant, descriptor, newValue);
        this.notificationService.notifySubscribers(this.subscribers, this.games.get(gameId));
    }

    public void addSubscriber(String id, Subscriber subscriber) {
        this.subscribers.put(id, subscriber);
    }

    public Subscriber removeSubscription(String id) {
        Subscriber subscriber = this.subscribers.get(id);
        this.subscribers.remove(id);
        return subscriber;
    }

    public abstract void createNewGame(String id, List<Participant> participants, String name, String description);
}
