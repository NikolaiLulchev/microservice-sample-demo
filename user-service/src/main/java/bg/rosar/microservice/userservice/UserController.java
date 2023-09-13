package bg.rosar.microservice.userservice;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserViewDTO>> getAllUsers() {
        log.info("Inside getAllUsers method of UserController");
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id) {
        log.info("Inside getUserById method of UserController");
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/")
    public ResponseEntity<?> saveUser(@RequestBody @Valid UserRegisterDTO userModel,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return ResponseEntity.unprocessableEntity().body(errors);
        }

        return ResponseEntity.ok(userService.saveUser(userModel));
    }
}
