package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Objects.isNull;

@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    @Getter
    @Setter
    @Column(name = "name")
    private String name;
    @Getter
    @Setter
    @Column(name = "money")
    private Double money;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            mappedBy = "person", fetch = FetchType.LAZY)
    private List<Item> items;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bestBidPerson", fetch = FetchType.LAZY)
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
