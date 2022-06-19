package com.demo.auctionhose.service.map;

import com.demo.auctionhose.model.Item;
import com.demo.auctionhose.service.CrudService;

import java.util.Set;

public class ItemMapService extends AbstractMapService<Item, Long> implements CrudService<Item, Long> {
    @Override
    public Set<Item> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Item object) {
        super.delete(object);
    }

    @Override
    public Item save(Item object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Item findById(Long id) {
        return super.findById(id);
    }
}
