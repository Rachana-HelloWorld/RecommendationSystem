package com.example.recommendationEngine.controller;

import com.example.recommendationEngine.contracts.MentorRequest;
import com.example.recommendationEngine.contracts.RecommendationResponse;
import com.example.recommendationEngine.resources.MentorResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class MentorController {

    @Inject
    MentorResource mentorResource;

    @RequestMapping("/mentors")
    public ResponseEntity<RecommendationResponse> getMentors(@RequestBody MentorRequest mentorRequest) {
        return mentorResource.getMentors(mentorRequest);
    }
}
