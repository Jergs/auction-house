package com.demo.auctionhouse.model;

import com.demo.auctionhouse.model.enums.LotStatus;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "lot_detail")
public class LotDetail extends BaseEntity {

    @Column(name = "initial_price")
    private Double initialPrice;
    @Column(name = "bid_price")
    private Double bidPrice;
    @Column(name = "expire_date_time")
    private LocalDateTime expireDateTime;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private LotStatus status;
}
