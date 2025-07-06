package com.xworkz.collections.runner;

import com.xworkz.collections.dto.AboutDTO;
import com.xworkz.collections.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmployeeRunner {
        public static void main(String[] args) {
            Collection<EmployeeDTO> employees = new ArrayList<>();
            employees.add(new EmployeeDTO("Ankit", 30, 75, "Mumbai", "TCS", 5.0, 1001));
            employees.add(new EmployeeDTO("Neha", 28, 60, "Pune", "Infosys", 3.5, 1002));
            employees.add(new EmployeeDTO("Karan", 35, 85, "Delhi", "Wipro", 10.2, 1003));
            employees.add(new EmployeeDTO("Sneha", 26, 55, "Bangalore", "IBM", 2.8, 1004));
            employees.add(new EmployeeDTO("Rajesh", 40, 90, "Chennai", "Accenture", 15.0, 1005));
            employees.add(new EmployeeDTO("Divya", 32, 62, "Hyderabad", "Capgemini", 6.0, 1006));
            employees.add(new EmployeeDTO("Vikram", 29, 78, "Noida", "HCL", 4.2, 1007));
            employees.add(new EmployeeDTO("Meera", 27, 58, "Kolkata", "Tech Mahindra", 3.1, 1008));
            employees.add(new EmployeeDTO("Arjun", 31, 80, "Ahmedabad", "Cognizant", 7.5, 1009));
            employees.add(new EmployeeDTO("Tanvi", 25, 54, "Nagpur", "L&T Infotech", 2.2, 1010));


//            for (EmployeeDTO emp : employees) {
//                System.out.println("Name: " + emp.getName());
//                System.out.println("Age: " + emp.getAge());
//                System.out.println("Weight: " + emp.getWeight());
//                System.out.println("Location: " + emp.getLocation());
//                System.out.println("Company: " + emp.getCompany());
//                System.out.println("Experience: " + emp.getExperience());
//                System.out.println("Employee ID: " + emp.getEmpId());
//
//                System.out.println("=================");
//            }
            Iterator<EmployeeDTO> iterator=employees.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

