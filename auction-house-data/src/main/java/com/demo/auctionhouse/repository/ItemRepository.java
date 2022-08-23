package com.demo.auctionhouse.repository;

import com.demo.auctionhouse.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
