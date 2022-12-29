package com.demo.auctionhouse.bootstrap;

import com.demo.auctionhouse.model.*;
import com.demo.auctionhouse.model.enums.LotStatus;
import com.demo.auctionhouse.service.ItemTypeService;
import com.demo.auctionhouse.service.LotDecriptionService;
import com.demo.auctionhouse.service.LotService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

import static com.demo.auctionhouse.model.enums.LotStatus.ACTIVE;
import static com.demo.auctionhouse.model.enums.LotStatus.CLOSED;

@Component
@AllArgsConstructor
@Profile("jpa")
public class DataLoaderJpa implements CommandLineRunner {

    private final ItemTypeService itemTypeService;
    private final LotService lotService;
    private final LotDecriptionService lotDecriptionService;

    @Override
    public void run(String... args) throws Exception {

        int count = itemTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        ItemType weapon = createItemType("Weapon");
        ItemType armor = createItemType("Armor");

        Item chainMail = createItem("Chain Mail", armor);
        Item helmet = createItem("Helmet", armor);
        Item sword = createItem("Sword", weapon);
        Item bow = createItem("Bow", weapon);

        Person chack = createPerson("Chack", 10000.0, List.of(sword, helmet));
        Person patrick = createPerson("Patrick", 20000.0, List.of(bow, chainMail));

        LotDetail description = createLotDescription(5000.0, 7000.0,
                LocalDateTime.now().plusDays(2), ACTIVE);
        LotDetail description2 = createLotDescription(3000.0, 3500.0,
                LocalDateTime.now().minusDays(2), CLOSED);

        Lot lot = createLot(bow, patrick, chack, description);

        Lot lot2 = createLot(helmet, chack, patrick, description2);

        lotService.save(lot);
        lotService.save(lot2);
    }

    private Lot createLot(Item item,
                          Person person,
                          Person bestBidPerson,
                          LotDetail description) {
        Lot lot = new Lot();
        lot.setItem(item);
        lot.setSeller(person);
        lot.setBestBidPerson(bestBidPerson);
        lot.setDescription(description);
        person.getLots().add(lot);
        bestBidPerson.getBidLots().add(lot);
        return lot;
    }

    private ItemType createItemType(String name) {
        ItemType itemType = new ItemType();
        itemType.setType(name);
        itemTypeService.save(itemType);
        return itemType;
    }

    private LotDetail createLotDescription(Double originPrice,
                                           Double bidPrice,
                                           LocalDateTime dateTime,
                                           LotStatus status) {
        LotDetail description = new LotDetail();
        description.setInitialPrice(originPrice);
        description.setBidPrice(bidPrice);
        description.setExpireDateTime(dateTime);
        description.setStatus(status);
        lotDecriptionService.save(description);
        return description;
    }

    private Item createItem(String name, ItemType type) {
        Item item = new Item();
        item.setName(name);
        item.setType(type);
        return item;
    }

    private Person createPerson(String name, Double money, List<Item> items) {
        Person person = new Person();
        person.setName(name);
        person.setMoney(money);
        person.getItems().addAll(items);
        return person;
    }
}