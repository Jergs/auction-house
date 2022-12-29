package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "item_type")
public class ItemType extends BaseEntity {

    @Column(name = "type")
    private String type;
    @Column(name = "description")
    private String description;
}
