package dto;

public class AryanDTO {
    private String fullName;
    private String email;
    private String phone;
    private String location;

    private void AryanDTO(){
        System.out.println("Running no arg constructor in DTO");
    }

    public AryanDTO(String fullName, String email, String phone, String location) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.location = location;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AryanDTO{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
