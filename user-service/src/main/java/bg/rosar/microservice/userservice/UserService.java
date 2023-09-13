package bg.rosar.microservice.userservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserViewDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public UserViewDTO getUserById(Long userId) {
        return userRepository.findById(userId).map(this::mapToDTO).orElseThrow();
    }

    public User saveUser(UserRegisterDTO userModel) {
        User user = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setUsername(userModel.getUsername());
        //TODO: encrypt password
        user.setPassword(userModel.getPassword());

        return userRepository.save(user);
    }

    private UserViewDTO mapToDTO(User user) {
        return new UserViewDTO(user.getEmail(), user.getFirstName() + " " + user.getLastName());
    }

}
