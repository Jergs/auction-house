package com.demo.auctionhose.service.map;

import com.demo.auctionhose.model.Lot;
import com.demo.auctionhose.service.CrudService;

import java.util.Set;

public class LotMapService extends AbstractMapService<Lot, Long> implements CrudService<Lot, Long> {

    @Override
    public Set<Lot> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Lot object) {
        super.delete(object);
    }

    @Override
    public Lot save(Lot object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Lot findById(Long id) {
        return super.findById(id);
    }
}
