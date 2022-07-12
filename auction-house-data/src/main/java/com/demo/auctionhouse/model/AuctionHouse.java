package com.demo.auctionhouse.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuctionHouse extends BaseEntity {
    private String name;
    private Set<Lot> lots;
}
