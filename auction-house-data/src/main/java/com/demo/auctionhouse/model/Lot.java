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
    @Column(name = "bid_price")
    private Double bidPrice;
    @Column(name = "expire_date_time")
    private LocalDateTime expireDateTime;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private LotStatus status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private Person seller;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "best_bid_person_id")
    private Person bestBidPerson;
}
