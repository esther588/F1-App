package com.F1App;

import com.F1App.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public User getUser(){
        return new User("Defaut User", "1", 40);
    }
}
