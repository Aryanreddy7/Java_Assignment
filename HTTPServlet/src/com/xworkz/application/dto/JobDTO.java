package com.xworkz.application.dto;

import java.io.Serializable;

public class JobDTO implements Serializable {
    private String name;
    private String email;
    private String education;
    private String skills;
    private Double expectedSalary;
    private String experience;

    public JobDTO(){
        System.out.println("Running no-arg const in JobDTO");
    }

    public JobDTO(String name, String email, String education, String skills, Double expectedSalary, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.expectedSalary = expectedSalary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(Double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
