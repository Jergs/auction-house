package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
