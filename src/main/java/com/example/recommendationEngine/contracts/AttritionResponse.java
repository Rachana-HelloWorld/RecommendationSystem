package com.example.recommendationEngine.contracts;

import java.util.List;

public class AttritionResponse {

    private List<String> mentors;
    private List<String> trainings;

    public List<String> getMentors() {
        return mentors;
    }

    public void setMentors(List<String> mentors) {
        this.mentors = mentors;
    }

    public List<String> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<String> trainings) {
        this.trainings = trainings;
    }
}
