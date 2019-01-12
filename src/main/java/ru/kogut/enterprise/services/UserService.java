package ru.kogut.enterprise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.model.User;
import ru.kogut.enterprise.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    public User getById(String id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }

    public void save(User user){
        userRepository.save(user);
    }
}
