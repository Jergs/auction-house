package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.LotDescription;
import com.demo.auctionhouse.repository.LotDescriptionRepository;
import com.demo.auctionhouse.service.LotDecriptionService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class LotDescriptionServiceImpl implements LotDecriptionService {

    private final LotDescriptionRepository lotDescriptionRepository;

    @Override
    public Set<LotDescription> findAll() {
        return new HashSet<>(lotDescriptionRepository.findAll());
    }

    @Override
    public LotDescription findById(Long aLong) {
        return lotDescriptionRepository.findById(aLong).orElse(null);
    }

    @Override
    public LotDescription save(LotDescription object) {
        return lotDescriptionRepository.save(object);
    }

    @Override
    public void delete(LotDescription object) {
        lotDescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        lotDescriptionRepository.deleteById(aLong);
    }
}
