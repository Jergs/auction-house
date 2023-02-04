package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Objects.isNull;

@Entity
@Table(name = "user_details", schema = "public")
public class UserDetails extends BaseEntity {

    @Getter
    @Setter
    @Column(name = "name")
    private String name;
    @Getter
    @Setter
    @Column(name = "money_amount")
    private Double money;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            mappedBy = "userDetailsId", fetch = FetchType.LAZY)
    private List<Item> items;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bestBidUserDetails", fetch = FetchType.LAZY)
    private Set<Lot> bidLots;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seller", fetch = FetchType.LAZY)
    private Set<Lot> lots;

    public List<Item> getItems() {
        if (isNull(items))
            items = new ArrayList<>();
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Set<Lot> getBidLots() {
        if (isNull(bidLots))
            bidLots = new HashSet<>();
        return bidLots;
    }

    public void setBidLots(Set<Lot> bidLots) {
        this.bidLots = bidLots;
    }

    public Set<Lot> getLots() {
        if (isNull(lots))
            lots = new HashSet<>();
        return lots;
    }

    public void setLots(Set<Lot> lots) {
        this.lots = lots;
    }

}
