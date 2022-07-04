package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.AuctionHouse;
import com.demo.auctionhouse.service.AuctionService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuctionMapService extends AbstractMapService<AuctionHouse, Long> implements AuctionService {

    @Override
    public Set<AuctionHouse> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(AuctionHouse object) {
        super.delete(object);
    }

    @Override
    public AuctionHouse save(AuctionHouse object) {
        return super.save(object);
    }

    @Override
    public AuctionHouse findById(Long id) {
        return super.findById(id);
    }
}
