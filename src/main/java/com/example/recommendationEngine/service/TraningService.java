package com.example.recommendationEngine.service;

import com.example.recommendationEngine.contracts.RecommendationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TraningService {

    @Autowired
    private ElasticSearchConnection elasticSearchConnection;

    public ResponseEntity<RecommendationResponse> getTrainings(String query) {

        List<Map<String, Object>> res = elasticSearchConnection.search(query, "training");
        if (res == null)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        RecommendationResponse recommendationResponse = new RecommendationResponse();
        if (res.isEmpty())
            return ResponseEntity.status(HttpStatus.OK).body(recommendationResponse);
        List<String> trainingResponse = new ArrayList<>();
        for (Map<String, Object> map : res) {
            if (!map.isEmpty()) {
                trainingResponse.add(map.get("name").toString());
            }
        }
        recommendationResponse.setNames(trainingResponse);
        return ResponseEntity.status(HttpStatus.OK).body(recommendationResponse);
    }
}
