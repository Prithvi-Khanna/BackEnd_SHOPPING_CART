package casestudy.shop.service;

import casestudy.shop.model.Users;
import casestudy.shop.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public class CurrentUserService {

    @Autowired
    UsersRepository UsersRepo;

    public Optional<Users> CurrentUser(Principal principal)
    {
        String name = principal.getName();
        return UsersRepo.findByUsername(name);
    }

    public Long getuserid(Principal principal) {

        String name = principal.getName();
        Long id = UsersRepo.findByUsername(name).get().getuserid();
        return id;
    }

    /*
    public Long getuserrole(Principal principal)
    {
        return UsersRepo.findByUsername(principal.getName()).get().getRole().getRoleid();
    }

    */
    public Optional<Users> getuserprofile(Principal principal)
    {
        return UsersRepo.findByUsername(principal.getName());
    }


}
