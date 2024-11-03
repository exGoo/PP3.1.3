package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void update(Long id,User user);

    Optional<User> findByUsername(String username);
}

