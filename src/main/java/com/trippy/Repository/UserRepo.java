package com.trippy.Repository;

import com.trippy.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
     Users findByEmail(String email);
}


