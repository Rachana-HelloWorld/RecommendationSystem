package com.example.recommendationEngine.controller;

import com.example.recommendationEngine.contracts.RecommendationResponse;
import com.example.recommendationEngine.resources.TrainingResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Map;

@RestController
public class TrainingController {

    @Inject
    TrainingResource trainingResource;

    @RequestMapping("/training")
    public ResponseEntity<RecommendationResponse> getTrainings(@RequestBody Map<String, Integer> trainingRequest) {
        return trainingResource.getTrainings(trainingRequest);
    }
}
