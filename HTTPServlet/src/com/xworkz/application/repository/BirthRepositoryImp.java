package com.xworkz.application.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BirthRepositoryImp implements BirthRepository{
    @Override
    public void save() {
        System.out.println("running save in BirthRepositoryImp");
        System.out.println("WARN:Should save in DB");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//FQN
            String url="jdbc:mysql://localhost:3306/DatabaseConnection";
            String username="root";
            String password="Aryan@2003";
            try {
                Connection connection= DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
