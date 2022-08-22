package com.demo.auctionhose.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class Lot extends BaseEntity {

    private Item item;
    private Double originPrice;
    private Double bidPrice;
    private Person seller;
    private Person bestBidPerson;
    private LocalDateTime expireDateTime;
    private AuctionHouse auctionHouse;
}
