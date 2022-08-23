package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.Lot;
import com.demo.auctionhouse.repository.LotRepository;
import com.demo.auctionhouse.service.LotService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class LotServiceImpl implements LotService {

    private final LotRepository lotRepository;

    @Override
    public Set<Lot> findAll() {
        return new HashSet<>(lotRepository.findAll());
    }

    @Override
    public Lot findById(Long aLong) {
        return lotRepository.findById(aLong).orElse(null);
    }

    @Override
    public Lot save(Lot object) {
        return lotRepository.save(object);
    }

    @Override
    public void delete(Lot object) {
        lotRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        lotRepository.deleteById(aLong);
    }
}
