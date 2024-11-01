package com.example.showcase.service;

import com.example.showcase.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(int userId);

    List<User> getAllUsers();

    User updateUser(int userId, User updateUser);

    void deleteUser(int userId);

    Iterable<User> save(List<User> users);
}
