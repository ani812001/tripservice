package com.trippy.Repository;

import com.trippy.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long> {
}
