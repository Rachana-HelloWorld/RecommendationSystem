package com.example.recommendationEngine.model;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private List<String> skills;
    private String location;
    private List<String> interests;
    private Gender gender;
    private int yearsOfExp;

    public Employee() {
    }

    public Employee(String name, int age, String designation, List<String> skills, String location, List<String> interests, Gender gender, int yearsOfExp) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.skills = skills;
        this.location = location;
        this.interests = interests;
        this.gender = gender;
        this.yearsOfExp = yearsOfExp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
