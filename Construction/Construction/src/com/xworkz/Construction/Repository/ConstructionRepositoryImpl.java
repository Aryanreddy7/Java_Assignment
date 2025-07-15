package com.xworkz.Construction.Repository;

import com.xworkz.Construction.constant.DBConstant;
import com.xworkz.Construction.dto.ConstructionDTO;

import java.sql.*;
import java.util.Collections;
import java.util.List;

public class ConstructionRepositoryImpl implements ConstructionRepository {

    @Override
    public String save(ConstructionDTO dto) {
        System.out.println("Running save() in ConstructionRepositoryImpl");
        System.out.println("WARN: This should store the construction form in DB");

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB connection details
//            String url = "jdbc:mysql://localhost:3306/Construction_database";
//            String username = "root";
//            String password = "Aryan@2003";

            // Create connection
            Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(), DBConstant.USERNAME.getValue(), DBConstant.PASSWORD.getValue());

            // Create SQL statement
            String sql = "INSERT INTO Enquiry_form VALUES (0, '" +
                    dto.getFullName() + "', '" +
                    dto.getEmail() + "', '" +
                    dto.getPhone() + "', '" +
                    dto.getProjectType() + "', '" +
                    dto.getLocation() + "', '" +
                    dto.getStartDate() + "', " +
                    dto.getBudget() + ", " +
                    dto.isConsent() + ")";

            // Execute statement
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Data inserted successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "Success";
    }

    @Override
    public ConstructionDTO findById(int id) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DBConstant.URL.getValue(), DBConstant.USERNAME.getValue(), DBConstant.PASSWORD.getValue());

                String sql = "select * from Enquiry_form where id=" + id + " ";
                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);
                System.out.println("resultset" + resultSet);

                while (resultSet.next()) {
                    int pk = resultSet.getInt("id");
                    String fullName = resultSet.getString("Full_name");
                    String email = resultSet.getString("email");
                    String phone = resultSet.getString("phone");
                    String projectType = resultSet.getString("Project_type");
                    String location = resultSet.getString("location");
                    String startDate = resultSet.getString("startDate");
                    double budget = resultSet.getDouble("budget");
                    boolean consent = resultSet.getBoolean("consent");

                    ConstructionDTO constructionDTO = new ConstructionDTO(fullName, email, phone, projectType, location, startDate, budget, consent);
                    constructionDTO.setId(pk);

                    System.out.println(constructionDTO);
                    System.out.println("name: " + fullName + "email: " + email + "phone: " + phone);
                    return constructionDTO;

                }

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return null;
        }


}

