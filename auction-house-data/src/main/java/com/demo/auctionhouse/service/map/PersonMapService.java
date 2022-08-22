package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.Person;
import com.demo.auctionhouse.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonMapService extends AbstractMapService<Person, Long> implements PersonService {

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Person save(Person object) {
        return super.save(object);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Person findByLastName(String lastName) {
        return null;
    }
}
