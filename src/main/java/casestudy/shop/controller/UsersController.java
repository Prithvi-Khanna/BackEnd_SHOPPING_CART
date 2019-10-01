package casestudy.shop.controller;

import casestudy.shop.model.Users;
import casestudy.shop.exception1.NotFound;
import casestudy.shop.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

@CrossOrigin("*")
@RestController
@RequestMapping( value = "/users" , method = { RequestMethod.GET , RequestMethod.POST})
public class UsersController {

    @Autowired
    UsersRepository UsersRepo;

    @GetMapping("/get1")
    public List<Users> getAllNotes() {
        return UsersRepo.findAll();
    }

    @GetMapping("/get_user/{username}")
    public List<Users> getUser(@PathVariable( value = "username") String name)
    {
        if(UsersRepo.findByUsername(name).isEmpty())
        {
            List <Users> l1 = new ArrayList<>();
            l1.add(new Users(null,null,null));
            return l1;
        }
        else
        {
        return UsersRepo.findByUsername(name);

        }
    }

    @PostMapping("/post1")
    public Users createNote(@Valid @RequestBody Users user1) {
        return UsersRepo.save(user1);
    }

    @GetMapping("/get1/{id}")
    public Optional<Users> getNoteById(@PathVariable(value = "id") Long noteId) {
        return UsersRepo.findById(noteId);

        //To HAndle Error        .orElseThrow(() -> new NotFound("Note", "id", noteId));
    }

}
