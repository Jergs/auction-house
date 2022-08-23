package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.AuctionHouse;
import com.demo.auctionhouse.repository.AuctionHouseRepository;
import com.demo.auctionhouse.service.AuctionHouseService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class AuctionHouseServiceImpl implements AuctionHouseService {

    private final AuctionHouseRepository auctionHouseRepository;

    @Override
    public Set<AuctionHouse> findAll() {
        return new HashSet<>(auctionHouseRepository.findAll());
    }

    @Override
    public AuctionHouse findById(Long aLong) {
        Optional<AuctionHouse> auctionHouseOpt = auctionHouseRepository.findById(aLong);
        return auctionHouseOpt.orElse(null);
    }

    @Override
    public AuctionHouse save(AuctionHouse object) {
        return auctionHouseRepository.save(object);
    }

    @Override
    public void delete(AuctionHouse object) {
        auctionHouseRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        auctionHouseRepository.deleteById(aLong);
    }
}
