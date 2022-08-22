package com.demo.auctionhouse.service;

import com.demo.auctionhouse.model.Person;

public interface PersonService extends CrudService<Person, Long> {

    Person findByLastName(String lastName);
}
