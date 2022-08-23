package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "money")
    private Double money;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Item> items;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bestBidPerson")
    private Set<Lot> bidLots;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seller")
    private Set<Lot> lots;
}
