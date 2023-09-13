package bg.rosar.microservice.userservice;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegisterDTO {

    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    @Size(min = 1, max = 20)
    private String firstName;
    @NotEmpty
    @Size(min = 1, max = 20)
    private String lastName;
    @NotEmpty
    @Size(min = 4)
    private String password;
    private String confirmPassword;
    @NotEmpty
    @Size(min = 4, max = 20)
    private String username;

    public UserRegisterDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
