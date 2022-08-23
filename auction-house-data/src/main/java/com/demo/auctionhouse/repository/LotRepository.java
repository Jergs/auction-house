package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepository extends JpaRepository<Lot, Long> {
}
