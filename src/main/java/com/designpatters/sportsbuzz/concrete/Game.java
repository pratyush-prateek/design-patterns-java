package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.GameStatus;
import com.designpatters.sportsbuzz.enums.ScoreDescriptor;
import java.util.List;

public class Game {
    private String gameId;
    private String name;
    private String description;
    private List<Participant> participants;
    private ScoreBoard scoreBoard;
    private GameStatus gameStatus;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Game(String gameId, String name, String description, List<Participant> participants, List<ScoreDescriptor> scoreDescriptors) {
        this.gameId = gameId;
        this.name = name;
        this.description = description;
        this.participants = participants;
        this.scoreBoard = new ScoreBoard(this.participants, scoreDescriptors);
    }

    public String getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void updateScoreBoard(Participant participant, ScoreDescriptor scoreDescriptor, int newValue) {
        this.scoreBoard.updateScoreData(participant, scoreDescriptor, newValue);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId='" + gameId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", participants=" + participants +
                ", scoreBoard=" + scoreBoard.toString() +
                ", gameStatus=" + gameStatus +
                '}';
    }
}
