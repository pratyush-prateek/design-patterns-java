package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.GameStatus;
import com.designpatters.sportsbuzz.enums.ScoreDescriptor;
import com.designpatters.sportsbuzz.enums.SportsType;
import com.designpatters.sportsbuzz.exceptions.NonExistingEntityException;
import com.designpatters.sportsbuzz.exceptions.SportNotSupportedException;
import com.designpatters.sportsbuzz.interfaces.Subscriber;
import com.designpatters.sportsbuzz.services.NotificationService;

import java.util.*;

public class SportsBuzz {
    private Map<String,Sport> sports;
    private Map<String, Subscriber> users;
    private NotificationService notificationService;
    private Map<String,Participant> participants;

    public SportsBuzz() {
        this.sports = new HashMap<>();
        this.users = new HashMap<>();
        this.participants = new HashMap<>();
        this.notificationService = new NotificationService();
    }

    public Subscriber addNewUser(String userId, String fullName, int age, String email) {
        Subscriber newUser = new User(userId, fullName, age, email);
        this.users.put(userId, newUser);
        return newUser;
    }

    public Sport addNewSport(String id, String name, SportsType sportsType) throws SportNotSupportedException {
        Sport newSport = SportsFactory.getSportInstance(id, name, notificationService, sportsType);
        this.sports.put(id, newSport);
        return newSport;
    }

    public void subscribeToSport(String userId, String sportId) throws NonExistingEntityException {
        Subscriber subscriber = this.users.get(userId);
        Sport sport = this.sports.get(sportId);
        if(subscriber == null)
            throw new NonExistingEntityException("User does not exist with the given id");

        if(sport == null)
            throw new NonExistingEntityException("Sports does not exist with given id");

        sport.addSubscriber(userId, subscriber);
    }

    public void unsubscribeFromSport(String userId, String sportId) throws NonExistingEntityException {
        Subscriber subscriber = this.users.get(userId);
        Sport sport = this.sports.get(sportId);
        if(subscriber == null)
            throw new NonExistingEntityException("User does not exist with the given id");

        if(sport == null)
            throw new NonExistingEntityException("Sports does not exist with given id");

        sport.removeSubscription(userId);
    }

    public Participant addNewParticipant(String id, String name, String sportId)throws NonExistingEntityException {
        Sport sport = this.sports.get(sportId);

        if(sport == null)
            throw new NonExistingEntityException("Sport with the given id does not exist");

        Participant newParticipant = new Participant(id, name, new Date(), sport);
        this.participants.put(id, newParticipant);
        return newParticipant;
    }

    public void hostNewGame(String sportId, String gameId, List<String> participantIds, String gameName, String description) throws NonExistingEntityException {
        Sport sport = this.sports.get(sportId);

        if(sport == null)
            throw new NonExistingEntityException("Sport does not exist with the given id");

        List<Participant> participants = new ArrayList<>();
        for(String paricipantId: participantIds) {
            Participant participant = this.participants.get(paricipantId);

            if(participant == null)
                throw new NonExistingEntityException("Participant with the given ID does not exist");

            participants.add(participant);
        }

        sport.createNewGame(gameId, participants, gameName, description);
    }

    public void changeGameStatus(String sportId, String gameId, GameStatus gameStatus) throws NonExistingEntityException {
        Sport sport = this.sports.get(sportId);

        if(sport == null)
            throw new NonExistingEntityException("Sport does not exist with the given id");

        sport.updateGameStatus(gameId, gameStatus);
    }

    public void updateGameScoreBoard(String sportId, String gameId, String participantId, ScoreDescriptor descriptor, int newValue) throws NonExistingEntityException{
        Sport sport = this.sports.get(sportId);

        if(sport == null)
            throw new NonExistingEntityException("Sport does not exist with the given id");

        Participant participant = this.participants.get(participantId);

        if(participant == null)
            throw new NonExistingEntityException("Participant with this ID does not exist");

        sport.updateScoreBoard(gameId, participant, descriptor, newValue);
    }
}
