package com.demo.auctionhose.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ItemType extends BaseEntity {
    private String type;
}
