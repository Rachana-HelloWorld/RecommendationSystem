package com.example.recommendationEngine.contracts;

import java.util.List;

public class MentorRequest {

    private List<String> keywords;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
