package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(long id);
    User saveUser(User user);
    void deleteUser(User user);

    User getUserByFirstName(String firstName);

}
