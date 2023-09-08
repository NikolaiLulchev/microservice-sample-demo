package bg.rosar.microservice.userservice;

import lombok.Data;

@Data
public class UserDTO {

    private String fullName;
    private String email;

    public UserDTO(String email, String firstName, String lastName) {
        this.email = email;
        this.fullName = firstName + " " + lastName;
    }
}
