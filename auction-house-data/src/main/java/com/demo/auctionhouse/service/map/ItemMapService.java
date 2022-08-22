package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.Item;
import com.demo.auctionhouse.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ItemMapService extends AbstractMapService<Item, Long> implements ItemService {

    @Override
    public Set<Item> findAll() {
        return super.findAll();
    }

    @Override
    public Item findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Item save(Item object) {
        return super.save(object);
    }

    @Override
    public void delete(Item object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
