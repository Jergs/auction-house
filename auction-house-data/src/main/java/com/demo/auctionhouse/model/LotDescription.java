package com.demo.auctionhouse.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class LotDescription extends BaseEntity {

    @Column(name = "origin_price")
    private Double originPrice;
    @Column(name = "bid_price")
    private Double bidPrice;
    @Column(name = "expire_date_time")
    private LocalDateTime expireDateTime;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private LotStatus status;
}
