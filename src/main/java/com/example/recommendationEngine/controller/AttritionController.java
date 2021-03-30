package com.example.recommendationEngine.controller;

import com.example.recommendationEngine.contracts.AttritionResponse;
import com.example.recommendationEngine.resources.AttritionResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class AttritionController {

    @Inject
    AttritionResource attritionResource;

    @RequestMapping("/attrition")
    public AttritionResponse getTrainingsMentors() {
        return attritionResource.getTrainingsMentors();
    }
}
