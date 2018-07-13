package ua.training.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.training.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
