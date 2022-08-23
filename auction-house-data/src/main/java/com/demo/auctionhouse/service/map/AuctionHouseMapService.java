package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.AuctionHouse;
import com.demo.auctionhouse.service.AuctionHouseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class AuctionHouseMapService extends AbstractMapService<AuctionHouse, Long> implements AuctionHouseService {

    @Override
    public Set<AuctionHouse> findAll() {
        return super.findAll();
    }

    @Override
    public AuctionHouse findById(Long id) {
        return super.findById(id);
    }

    @Override
    public AuctionHouse save(AuctionHouse object) {
        return super.save(object);
    }

    @Override
    public void delete(AuctionHouse object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
