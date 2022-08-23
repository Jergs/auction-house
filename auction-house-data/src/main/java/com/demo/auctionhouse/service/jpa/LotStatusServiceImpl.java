package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.LotStatus;
import com.demo.auctionhouse.repository.LotStatusRepository;
import com.demo.auctionhouse.service.LotStatusService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class LotStatusServiceImpl implements LotStatusService {

    private final LotStatusRepository lotStatusRepository;

    @Override
    public Set<LotStatus> findAll() {
        return new HashSet<>(lotStatusRepository.findAll());
    }

    @Override
    public LotStatus findById(Long aLong) {
        return lotStatusRepository.findById(aLong).orElse(null);
    }

    @Override
    public LotStatus save(LotStatus object) {
        return lotStatusRepository.save(object);
    }

    @Override
    public void delete(LotStatus object) {
        lotStatusRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        lotStatusRepository.deleteById(aLong);
    }
}
