package com.ram.springBootCRUD.service;

import com.ram.springBootCRUD.model.User;
import com.ram.springBootCRUD.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        return userRepo.findById(id).orElse(new User());
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(int id, User user) {
        user.setAge(user.getAge());
        user.setCity(user.getCity());
        return userRepo.save(user);
    }

    public void deleteUser(int id) {
       userRepo.deleteById(id);
    }
}
