package com.trippy.Repository;

import com.trippy.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
