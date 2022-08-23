package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.Person;
import com.demo.auctionhouse.repository.PersonRepository;
import com.demo.auctionhouse.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Set<Person> findAll() {
        return new HashSet<>(personRepository.findAll());
    }

    @Override
    public Person findById(Long aLong) {
        return personRepository.findById(aLong).orElse(null);
    }

    @Override
    public Person save(Person object) {
        return personRepository.save(object);
    }

    @Override
    public void delete(Person object) {
        personRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        personRepository.deleteById(aLong);
    }

    @Override
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }
}
