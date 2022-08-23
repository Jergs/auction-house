package com.demo.auctionhouse.bootstrap;

import com.demo.auctionhouse.model.Item;
import com.demo.auctionhouse.model.ItemType;
import com.demo.auctionhouse.model.Lot;
import com.demo.auctionhouse.model.Person;
import com.demo.auctionhouse.service.ItemService;
import com.demo.auctionhouse.service.ItemTypeService;
import com.demo.auctionhouse.service.LotService;
import com.demo.auctionhouse.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@AllArgsConstructor
@Profile({"default", "map"})
public class DataLoader implements CommandLineRunner {

    private final PersonService personService;
    private final LotService lotService;
    private final ItemService itemService;
    private final ItemTypeService itemTypeService;

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

        Lot lot = createLot(bow, patrick, chack, 5000.0, 7000.0,
                LocalDateTime.now().plusDays(2));

        Lot lot2 = createLot(helmet, chack, patrick, 3000.0, 3500.0,
                LocalDateTime.now().plusDays(2));
    }

    private Lot createLot(Item item,
                          Person person,
                          Person bestBidPerson,
                          Double originPrice,
                          Double bidPrice,
                          LocalDateTime expireDateTime) {
        Lot lot = new Lot();
        lot.setItem(item);
        lot.setSeller(person);
        lot.setBestBidPerson(bestBidPerson);
        lot.setOriginPrice(originPrice);
        lot.setBidPrice(bidPrice);
        lot.setExpireDateTime(expireDateTime);
        lotService.save(lot);
        return lot;
    }

    private ItemType createItemType(String name) {
        ItemType itemType = new ItemType();
        itemType.setType(name);
        itemTypeService.save(itemType);
        return itemType;
    }

    private Item createItem(String name, ItemType type) {
        Item item = new Item();
        item.setName(name);
        item.setType(type);
        itemService.save(item);
        return item;
    }

    private Person createPerson(String name, Double money, List<Item> items) {
        Person person = new Person();
        person.setName(name);
        person.setMoney(money);
        person.setItems(items);
        personService.save(person);
        return person;
    }
}