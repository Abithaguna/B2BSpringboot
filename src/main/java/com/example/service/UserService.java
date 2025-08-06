package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // REGISTER USER — Check if email exists, else save
    public boolean registerUser(User user) {
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            return false; // Email already exists
        }
        repo.save(user); // Save with plain password (not recommended for production)
        return true;
    }

    // AUTHENTICATE — Match email and plain password
    public User authenticate(String email, String password) {
        return repo.findByEmail(email)
                   .filter(u -> u.getPassword().equals(password)) // plain-text check
                   .orElse(null);
    }
}
