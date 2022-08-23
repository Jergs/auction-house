package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.Item;
import com.demo.auctionhouse.repository.ItemRepository;
import com.demo.auctionhouse.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Set<Item> findAll() {
        return new HashSet<>(itemRepository.findAll());
    }

    @Override
    public Item findById(Long aLong) {
        Optional<Item> optionalItem = itemRepository.findById(aLong);
        return optionalItem.orElse(null);
    }

    @Override
    public Item save(Item object) {
        return itemRepository.save(object);
    }

    @Override
    public void delete(Item object) {
        itemRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        itemRepository.deleteById(aLong);
    }
}
