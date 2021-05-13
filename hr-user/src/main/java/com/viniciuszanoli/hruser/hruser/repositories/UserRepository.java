package com.viniciuszanoli.hruser.hruser.repositories;

import com.viniciuszanoli.hruser.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
