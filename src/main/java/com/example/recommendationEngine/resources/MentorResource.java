package com.example.recommendationEngine.resources;

import com.example.recommendationEngine.contracts.MentorRequest;
import com.example.recommendationEngine.contracts.RecommendationResponse;
import com.example.recommendationEngine.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MentorResource {

    @Autowired
    private MentorService mentorService;

    public ResponseEntity<RecommendationResponse> getMentors(MentorRequest mentorRequest) {
        StringBuilder sb = new StringBuilder()  ;
        for (String keyword : mentorRequest.getKeywords()) {
            sb.append(keyword).append("~1").append(" ");
        }
        return mentorService.getMentors(sb.toString());
    }
}
