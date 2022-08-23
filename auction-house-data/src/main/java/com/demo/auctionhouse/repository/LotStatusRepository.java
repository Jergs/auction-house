package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.LotStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotStatusRepository extends JpaRepository<LotStatus, Long> {
}
