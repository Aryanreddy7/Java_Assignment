package com.xworkz.Construction.Repository;

import com.xworkz.Construction.dto.ConstructionDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConstructionRepositoryImpl implements ConstructionRepository {

    @Override
    public void save(ConstructionDTO dto) {
        System.out.println("Running save() in ConstructionRepositoryImpl");
        System.out.println("WARN: This should store the construction form in DB");

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB connection details
            String url = "jdbc:mysql://localhost:3306/Construction_database";
            String username = "root";
            String password = "Aryan@2003";

            // Create connection
            Connection connection = DriverManager.getConnection(url, username, password);

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
    }

}

