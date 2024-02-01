package com.trippy.Repository;

import com.trippy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepo extends JpaRepository<User, Long > {
    User findByEmail(String email);
}

