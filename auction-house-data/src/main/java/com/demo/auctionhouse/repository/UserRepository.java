package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    UserDetails findByName(String name);
}
