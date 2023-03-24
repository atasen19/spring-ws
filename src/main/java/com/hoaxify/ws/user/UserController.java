package com.hoaxify.ws.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/api/v1/users")
    public void createUser(@RequestBody User user){
        log.info(user.toString());
    }
}
