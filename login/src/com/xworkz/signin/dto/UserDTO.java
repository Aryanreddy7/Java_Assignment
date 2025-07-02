package com.xworkz.signin.dto;

public class UserDTO {
    private String email;
    private String userId;
    private String password;
    private String createdAt;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
