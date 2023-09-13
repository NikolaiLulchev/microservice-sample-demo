package bg.rosar.microservice.userservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
