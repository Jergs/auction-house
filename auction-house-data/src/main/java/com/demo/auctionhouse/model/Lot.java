package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "lots")
public class Lot extends BaseEntity {

    @Column(name = "origin_price")
    private Double originPrice;
    @Column(name = "origin_price")
    private Double bidPrice;
    @Column(name = "expire_date_time")
    private LocalDateTime expireDateTime;

    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person seller;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person bestBidPerson;
    @ManyToOne
    @JoinColumn(name = "auction_house_id")
    private AuctionHouse auctionHouse;
}
