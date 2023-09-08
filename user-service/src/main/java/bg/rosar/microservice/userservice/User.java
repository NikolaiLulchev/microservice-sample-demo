package bg.rosar.microservice.userservice;

import lombok.Data;

@Data
public class User {

    private String id;
    private String firstName;
    private String LastName;
    private String email;
    private String password;
}
