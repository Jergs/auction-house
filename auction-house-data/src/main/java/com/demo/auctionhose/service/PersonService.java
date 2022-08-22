package com.demo.auctionhose.service;

import com.demo.auctionhose.model.Person;

import java.util.List;

public interface PersonService extends CrudService<Person, Long> {

    Person findByLastName(String lastName);
}
