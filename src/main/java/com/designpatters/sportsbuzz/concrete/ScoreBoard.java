package com.designpatters.sportsbuzz.concrete;

import com.designpatters.sportsbuzz.enums.ScoreDescriptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreBoard {
    private Map<Participant, Map<ScoreDescriptor, Integer>> scores;
    public ScoreBoard(List<Participant> participants, List<ScoreDescriptor> scoreDescriptors) {
        this.scores = new HashMap<>();
        for(Participant participant: participants) {
            Map<ScoreDescriptor,Integer> score = new HashMap<>();
            for(ScoreDescriptor scoreDescriptor: scoreDescriptors)
                score.put(scoreDescriptor, 0);

            this.scores.put(participant, score);
        }
    }

    public void updateScoreData(Participant participant, ScoreDescriptor scoreDescriptor, Integer newValue) {
        Map<ScoreDescriptor,Integer> score = this.scores.get(participant);
        score.put(scoreDescriptor, newValue);
        return;
    }

    @Override
    public String toString() {
        return "ScoreBoard{" +
                "scores=" + scores +
                '}';
    }
}
