package com.designpatters.sportsbuzz;

import com.designpatters.sportsbuzz.concrete.SportsBuzz;
import com.designpatters.sportsbuzz.enums.GameStatus;
import com.designpatters.sportsbuzz.enums.ScoreDescriptor;
import com.designpatters.sportsbuzz.enums.SportsType;

import java.util.Arrays;

public class Driver {
    public static void main(String args[])throws Exception {
        //Creating app instance
        SportsBuzz app = new SportsBuzz();

        //Onboard new sports
        //Cricket - 1
        //Football - 2
        app.addNewSport("1", "Cricket", SportsType.CRICKET);
        app.addNewSport("2", "Football", SportsType.FOOTBALL);

        //Onboard participants
        app.addNewParticipant("11", "India", "1");
        app.addNewParticipant("12", "England", "1");
        app.addNewParticipant("21", "Barcelona", "2");
        app.addNewParticipant("22", "Germany", "2");

        //add new users
        app.addNewUser("jh","John", 23, "johny@gmail.com");

        //John subscribes to a sport
        app.subscribeToSport("jh","1");
        app.subscribeToSport("jh", "2");

        //create a new game cricket
        app.hostNewGame("1","1a", Arrays.asList(new String[]{"11", "12"}), "India vs England", "Ashes");
        app.changeGameStatus("1", "1a", GameStatus.IN_PROGRESS);
        app.updateGameScoreBoard("1", "1a", "11", ScoreDescriptor.RUNS, 500);
        app.changeGameStatus("1", "1a", GameStatus.HALTED);
    }
}
