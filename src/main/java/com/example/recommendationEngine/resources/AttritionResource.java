package com.example.recommendationEngine.resources;

import com.example.recommendationEngine.contracts.AttritionResponse;
import com.example.recommendationEngine.service.AttritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AttritionResource {

    @Autowired
    AttritionService attritionService;

    public AttritionResponse getTrainingsMentors() {
        return attritionService.getTrainingsMentors();
    }
}
