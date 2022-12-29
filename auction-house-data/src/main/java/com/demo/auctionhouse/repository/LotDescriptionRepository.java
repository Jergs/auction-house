package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.LotDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotDescriptionRepository extends JpaRepository<LotDetail, Long> {
}
