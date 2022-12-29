package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.LotDetail;
import com.demo.auctionhouse.repository.LotDescriptionRepository;
import com.demo.auctionhouse.service.LotDetailService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class LotDetailServiceImpl implements LotDetailService {

    private final LotDescriptionRepository lotDescriptionRepository;

    @Override
    public Set<LotDetail> findAll() {
        return new HashSet<>(lotDescriptionRepository.findAll());
    }

    @Override
    public LotDetail findById(Long aLong) {
        return lotDescriptionRepository.findById(aLong).orElse(null);
    }

    @Override
    public LotDetail save(LotDetail object) {
        return lotDescriptionRepository.save(object);
    }

    @Override
    public void delete(LotDetail object) {
        lotDescriptionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        lotDescriptionRepository.deleteById(aLong);
    }
}
