package com.trippy.Repository;

import com.trippy.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserRepo extends JpaRepository<User, Long > {
    User findByEmail(String email);
}

