package com.example.recommendationEngine.model;

public class Training {

    private String name;
    private String description;
    private String author;
    private String NoOfHours;

    public Training() {
    }

    public Training(String name, String description, String suthor, String noOfHours) {
        this.name = name;
        this.description = description;
        this.author = suthor;
        NoOfHours = noOfHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNoOfHours() {
        return NoOfHours;
    }

    public void setNoOfHours(String noOfHours) {
        NoOfHours = noOfHours;
    }


}
