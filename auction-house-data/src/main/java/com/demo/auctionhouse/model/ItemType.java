package com.demo.auctionhouse.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum ItemType implements Serializable {

    WEAPON("Weapon"),
    ARMOR("Armor");

    final String value;

    @Override
    public String toString() {
        return value;
    }

    public static ItemType of(String value) {
        return Stream.of(values())
                .filter(p -> p.getValue().equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
