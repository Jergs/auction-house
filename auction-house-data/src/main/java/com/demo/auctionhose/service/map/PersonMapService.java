package com.demo.auctionhose.service.map;

import com.demo.auctionhose.model.Person;
import com.demo.auctionhose.service.CrudService;

import java.util.Set;

public class PersonMapService extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public Person save(Person object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}
