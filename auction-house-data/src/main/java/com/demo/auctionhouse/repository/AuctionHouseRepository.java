package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.AuctionHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionHouseRepository extends JpaRepository<AuctionHouse, Long> {
}
