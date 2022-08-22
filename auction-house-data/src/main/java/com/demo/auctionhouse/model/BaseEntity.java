package com.demo.auctionhouse.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
