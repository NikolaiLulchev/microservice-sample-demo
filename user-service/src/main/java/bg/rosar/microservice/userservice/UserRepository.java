package bg.rosar.microservice.userservice;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> usersDB = Collections.synchronizedList(new ArrayList<>());

    public List<User> getAll() {
        return new ArrayList<>(usersDB);
    }
}
