package com.xworkz.signin.repository;

import com.xworkz.signin.dto.UserDTO;

import java.sql.*;

public class UserRepositoryImpl implements UserRepository {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "password");
    }

    @Override
    public boolean save(UserDTO user) {
        String sql = "INSERT INTO users (email, userId, password, createdAt) VALUES (?, ?, ?, NOW())";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getUserId());
            stmt.setString(3, user.getPassword());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean validate(String userId, String password) {
        String sql = "SELECT * FROM users WHERE userId=? AND password=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
