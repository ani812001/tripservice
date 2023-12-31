package com.trippy.Repository;

import com.trippy.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepo extends JpaRepository<User, Long > {
//   public
      User findByEmail(String email);

   User findByUsername(String username);
}

