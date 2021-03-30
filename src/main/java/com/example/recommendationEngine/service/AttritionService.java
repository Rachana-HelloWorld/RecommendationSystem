package com.example.recommendationEngine.service;

import com.example.recommendationEngine.contracts.AttritionResponse;
import com.example.recommendationEngine.model.Employee;
import com.example.recommendationEngine.model.Gender;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class AttritionService {

//    Employee currentEmployee = new Employee("Rachana", 25, "Associate Software Engineer", Arrays.asList(""), "Hyderabad", Arrays.asList("Cooking", "Swimming"), Gender.Female, 3);

    public AttritionResponse getTrainingsMentors() {

        List<String> trainings = new ArrayList<>(Arrays.asList("Finding a Work-Life Balance", "Powering Through Your Day", "The Happy Secret to Better Work "));
        List<String> mentors = new ArrayList<>(Arrays.asList("Divya"));

        AttritionResponse attritionResponse = new AttritionResponse();
        attritionResponse.setTrainings(trainings);
        attritionResponse.setMentors(mentors);
        return attritionResponse;
    }
}
