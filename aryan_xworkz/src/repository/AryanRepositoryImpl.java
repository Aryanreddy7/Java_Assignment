package repository;

import dto.AryanDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AryanRepositoryImpl implements AryanRepository{

    @Override
    public void save(AryanDTO aryanDTO) {
        System.out.println("Running save() in AryanRepositoryImpl");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/aryan_database";
            String username = "root";
            String password = "Aryan@2003";

            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO register_form VALUES (0, '" +
                    aryanDTO.getFullName() + "', '" +
                    aryanDTO.getEmail() + "', '" +
                    aryanDTO.getPhone() + "', '" +
                    aryanDTO.getLocation() + "' )";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Data inserted successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
