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
public class MentorService {

    @Autowired
    private ElasticSearchConnection elasticSearchConnection;

    public ResponseEntity<RecommendationResponse> getMentors(String query) {
        List<Map<String, Object>> res = elasticSearchConnection.search(query, "employees");
        if (res == null)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        RecommendationResponse recommendationResponse = new RecommendationResponse();
        if (res.isEmpty())
            return ResponseEntity.status(HttpStatus.OK).body(recommendationResponse);
        List<String> mentorsResponse = new ArrayList<>();
        for (Map<String, Object> map : res) {
            if (!map.isEmpty()) {
                mentorsResponse.add(map.get("name").toString());
            }
        }
        recommendationResponse.setNames(mentorsResponse);
        return ResponseEntity.status(HttpStatus.OK).body(recommendationResponse);
    }
}
