package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.ItemType;
import com.demo.auctionhouse.repository.ItemTypeRepository;
import com.demo.auctionhouse.service.ItemTypeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class ItemTypeServiceImpl implements ItemTypeService {

    private final ItemTypeRepository itemTypeRepository;

    @Override
    public Set<ItemType> findAll() {
        return new HashSet<>(itemTypeRepository.findAll());
    }

    @Override
    public ItemType findById(Long aLong) {
        return itemTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public ItemType save(ItemType object) {
        return itemTypeRepository.save(object);
    }

    @Override
    public void delete(ItemType object) {
        itemTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        itemTypeRepository.deleteById(aLong);
    }
}
