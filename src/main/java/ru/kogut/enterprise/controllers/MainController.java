package ru.kogut.enterprise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kogut.enterprise.model.User;
import ru.kogut.enterprise.repository.UserRepository;
import ru.kogut.enterprise.services.UserService;

import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return getAllUsers();
    }

    @RequestMapping("/getAllUsers")
    public String getAllUsersMapping(){
        return getAllUsers();
    }

    public String getAllUsers(){
        String res = "";
        Iterable<User> users = userService.findAll();
        for (User user:users) {
            res = res + user.toString() + "<br />";
        }
        if (res.isEmpty()){
            res = "List is empty";
        }
        return res;
    }

    @RequestMapping("/getUser")
    public User getUser(@RequestParam(value = "id") String id){
        return userService.getById(id);
    }

    @RequestMapping("/addUser")
    public User addUser(@RequestParam(value = "name") String name){
        if (name == null || name.isEmpty()) return null;
        User user = new User(name);
        userService.save(user);
        return user;
    }
}
