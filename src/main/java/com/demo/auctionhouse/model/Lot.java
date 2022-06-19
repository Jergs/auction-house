package com.demo.auctionhouse.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Lot {

    private Item item;
    private Double originPrice;
    private Double bidPrice;
    private Person seller;
    private LocalDate expireDate;
}
