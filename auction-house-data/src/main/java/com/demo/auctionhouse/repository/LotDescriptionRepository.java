package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.LotDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotDescriptionRepository extends JpaRepository<LotDescription, Long> {
}
