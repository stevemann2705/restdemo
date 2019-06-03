package in.stevemann.restdemo.controllers;

import in.stevemann.restdemo.domain.User;
import in.stevemann.restdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
        User user = new User();
        user.setAge(age);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        userRepository.save(user);

        return ResponseEntity.ok(user);
    }
}
