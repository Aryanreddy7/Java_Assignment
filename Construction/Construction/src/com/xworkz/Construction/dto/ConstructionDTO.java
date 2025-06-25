package com.xworkz.Construction.dto;

public class ConstructionDTO {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String projectType;
    private String location;
    private String startDate;
    private double budget;
    private boolean consent;

    public ConstructionDTO() {
        System.out.println("Running no-arg Constructor in ConstructionDTO");
    }

    public ConstructionDTO(String fullName, String email, String phone, String projectType,
                           String location, String startDate, double budget, boolean consent) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.projectType = projectType;
        this.location = location;
        this.startDate = startDate;
        this.budget = budget;
        this.consent = consent;
    }

    public ConstructionDTO(String name, String email, String phone, String projectType, String startDate, String budget, String consent) {
    }


    // Getters and Setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getProjectType() { return projectType; }
    public void setProjectType(String projectType) { this.projectType = projectType; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public boolean isConsent() { return consent; }
    public void setConsent(boolean consent) { this.consent = consent; }

    @Override
    public String toString() {
        return "ConstructionDTO{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", projectType='" + projectType + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", budget=" + budget +
                ", consent=" + consent +
                '}';
    }
    public void setId(int pk) {
        this.id=id;
    }

    public int getId() {
        return id;
    }
}