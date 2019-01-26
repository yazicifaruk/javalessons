package crudEx.demo.mainController;

import crudEx.demo.Repo.UserRepository;
import crudEx.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller{
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return (List<Users>) userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users) {
        userRepository.save(users);
        return (List<Users>) userRepository.findAll();
    }


}
