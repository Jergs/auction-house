package com.demo.auctionhouse.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AuctionHouse extends BaseEntity {
    private String name;
}