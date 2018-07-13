package ua.training.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.training.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
