package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);
}
