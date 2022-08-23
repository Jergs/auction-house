package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType, Long> {
}
