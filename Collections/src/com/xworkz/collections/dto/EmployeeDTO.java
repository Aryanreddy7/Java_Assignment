package com.xworkz.collections.dto;

public class EmployeeDTO {
        private String name;
        private int age;
        private int weight;
        private String location;
        private String company;
        private double experience;
        private int empId;

        public EmployeeDTO(String name, int age, int weight, String location, String company, double experience, int empId) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.location = location;
            this.company = company;
            this.experience = experience;
            this.empId = empId;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public int getWeight() { return weight; }
        public String getLocation() { return location; }
        public String getCompany() { return company; }
        public double getExperience() { return experience; }
        public int getEmpId() { return empId; }
    }
