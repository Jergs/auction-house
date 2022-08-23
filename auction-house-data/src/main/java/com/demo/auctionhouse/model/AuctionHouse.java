package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;

@Entity
@Table(name = "auction_house")
public class AuctionHouse extends BaseEntity {

    @Getter
    @Setter
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auctionHouse")
    private Set<Lot> lots;

    public Set<Lot> getLots() {
        if (isNull(lots))
            lots = new HashSet<>();
        return lots;
    }

    public void setLots(Set<Lot> lots) {
        this.lots = lots;
    }
}
