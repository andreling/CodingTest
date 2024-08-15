package com.example.application.Service;

import com.example.application.Model.User;
import com.example.application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository repository;

    public User checkUser(String username, String password){
        return repository.findAccount(username,password);
    }

    public void saveUser(User user){
        repository.save(user);
    }

    public void viewAllUser(){
        System.out.println(repository.findAll());;
    }
}
