package com.demo.auctionhouse.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class Lot extends BaseEntity {

    private Item item;
    private Double originPrice;
    private Double bidPrice;
    private Double minStep;
    private Person seller;
    private LocalDate expireDate;
    private AuctionHouse auctionHouse;
}
