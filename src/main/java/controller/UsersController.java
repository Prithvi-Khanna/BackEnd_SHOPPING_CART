package controller;

import model.Users;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping( value = "/users" , method = { RequestMethod.GET , RequestMethod.POST})
public class UsersController {

    @PostMapping(path = "/post", produces = "application/json")
    public int register(@RequestBody Users user1) {
        return 90;
    }
}
