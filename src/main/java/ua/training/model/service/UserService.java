package ua.training.model.service;

import ua.training.model.entity.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
