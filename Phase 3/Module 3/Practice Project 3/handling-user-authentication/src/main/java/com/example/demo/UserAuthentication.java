package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
    private List<User> users = new ArrayList<>();

    public boolean login(User user) {
        return users.stream()
            .anyMatch(u -> u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword()));
    }

    public List<User> listOfUsers() {
        return users;
    }

    public String register(User user) {
        if (users.stream().anyMatch(u -> u.getEmail().equals(user.getEmail()))) {
            return "Email already exists";
        } else {
            users.add(user);
            return "Registered";
        }
    }
}
