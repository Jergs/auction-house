package com.demo.auctionhose.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Item extends BaseEntity {

    private String name;
    private ItemType type;
}
