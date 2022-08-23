package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.Lot;
import com.demo.auctionhouse.service.LotService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class LotMapService extends AbstractMapService<Lot, Long> implements LotService {

    @Override
    public Set<Lot> findAll() {
        return super.findAll();
    }

    @Override
    public Lot findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Lot save(Lot object) {
        return super.save(object);
    }

    @Override
    public void delete(Lot object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
