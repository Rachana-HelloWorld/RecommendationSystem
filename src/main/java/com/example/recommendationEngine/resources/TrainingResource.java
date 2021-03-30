package com.example.recommendationEngine.resources;

import com.example.recommendationEngine.contracts.RecommendationResponse;
import com.example.recommendationEngine.service.TraningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TrainingResource {

    @Autowired
    private TraningService traningService;

    public ResponseEntity<RecommendationResponse> getTrainings(Map<String, Integer> trainingRequest) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : trainingRequest.entrySet()) {
            if (entry.getValue() < 75) {
                sb.append(entry.getKey()).append("~1").append(" ");
            }
        }
        return traningService.getTrainings(sb.toString());

    }
}
