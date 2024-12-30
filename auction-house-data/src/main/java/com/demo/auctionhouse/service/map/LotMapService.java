package com.demo.auctionhouse.service.map;

import com.demo.auctionhouse.model.Lot;
import com.demo.auctionhouse.service.LotService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LotMapService extends AbstractMapService<Lot, Long> implements LotService {

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
        return super.save(object);
    }

    @Override
    public Lot findById(Long id) {
        return super.findById(id);
    }
}
