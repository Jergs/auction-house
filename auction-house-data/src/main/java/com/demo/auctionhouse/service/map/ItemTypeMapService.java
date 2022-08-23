package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.ItemType;
import com.demo.auctionhouse.service.ItemTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class ItemTypeMapService extends AbstractMapService<ItemType, Long> implements ItemTypeService {

    @Override
    public Set<ItemType> findAll() {
        return super.findAll();
    }

    @Override
    public ItemType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public ItemType save(ItemType object) {
        return super.save(object);
    }

    @Override
    public void delete(ItemType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
