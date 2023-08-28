package com.example.BuildRESTAPIs.services;

import com.example.BuildRESTAPIs.dao.UserRepo;
import com.example.BuildRESTAPIs.models.UserModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public void add(UserModels user) {

        userRepo.save(user);
    }

    public List<UserModels> getAll() {
       return userRepo.findAll();
    }

    public void update(UserModels newUser, Integer id) {

        UserModels userModels = userRepo.findById(id).get();
        userModels.setId(newUser.getId());
        userModels.setUsername(newUser.getUsername());
        userModels.setPassword(newUser.getPassword());
        userRepo.save(userModels);
    }

    public void delete(Integer id) {
        userRepo.deleteById(id);
    }

    public void deleteAll() {
        userRepo.deleteAll();
    }
}
