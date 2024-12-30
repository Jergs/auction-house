package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "lot")
public class Lot extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private UserDetails seller;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "best_bid_user_id")
    private UserDetails bestBidUserDetails;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detail_id")
    private LotDetail detail;
  
}
