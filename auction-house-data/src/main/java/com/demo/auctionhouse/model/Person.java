package com.demo.auctionhouse.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {

    private String name;
    private Double money;
    private List<Item> items;
}
