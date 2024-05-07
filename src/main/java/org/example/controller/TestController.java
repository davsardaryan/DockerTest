package org.example.controller;


import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public ResponseEntity<?> test() {

        return ResponseEntity.ok("Hello Docker");
    }


    @PostMapping
    public ResponseEntity<?> post(@RequestBody User user) {
        User user1 = userRepository.save(user);

        return ResponseEntity.ok(user1);
    }

}
