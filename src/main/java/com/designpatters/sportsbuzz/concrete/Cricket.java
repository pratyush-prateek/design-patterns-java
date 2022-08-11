package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.GameStatus;
import com.designpatters.sportsbuzz.enums.ScoreDescriptor;
import com.designpatters.sportsbuzz.services.NotificationService;
import java.util.ArrayList;
import java.util.List;

public class Cricket extends Sport {
    public Cricket(String name, String id, NotificationService notificationService) {
        super(name, id, notificationService);
    }

    @Override
    public void createNewGame(String id, List<Participant> participants, String name, String description) {
        List<ScoreDescriptor> descriptors = new ArrayList<>();
        descriptors.add(ScoreDescriptor.OVERS);
        descriptors.add(ScoreDescriptor.RUNS);
        descriptors.add(ScoreDescriptor.WICKETS);
        Game newGame = new Game(id, name, description, participants, descriptors);
        newGame.setGameStatus(GameStatus.NOT_STARTED);
        this.games.put(id, newGame);
        this.notificationService.notifySubscribers(this.subscribers, newGame);
    }
}
