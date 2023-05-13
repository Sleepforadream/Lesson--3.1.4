package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    void updateUser(Long id, User user);

    void deleteUser(Long userId);

    User getUserByUsername(String username);

    UserDetails loadUserByUsername(String username);
}
