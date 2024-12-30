package com.demo.auctionhouse.bootstrap;

import com.demo.auctionhouse.model.*;
import com.demo.auctionhouse.service.AuctionService;
import com.demo.auctionhouse.service.ItemService;
import com.demo.auctionhouse.service.LotService;
import com.demo.auctionhouse.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final PersonService personService;
    private final LotService lotService;
    private final AuctionService auctionService;
    private final ItemService itemService;

    @Override
    public void run(String... args) throws Exception {

        AuctionHouse auctionHouse = createAuctionHouse("My auction house");

        Item item1 = createItem("Master Sword", ItemType.WEAPON);
        Item item2 = createItem("Master Plate", ItemType.ARMOR);
        Item item3 = createItem("Очко Никиты", ItemType.ARMOR);

        Person person1 = createPerson("Karl", 10000.0);
        Person person2 = createPerson("Charley", 5000.0);
        Person person3 = createPerson("Oleg", 1000000.0);

        Lot lot1 = createLot(auctionHouse, item1, person2, 6000.0, 6500.0,
                500.0, LocalDate.now().plusDays(1));
        Lot lot2 = createLot(auctionHouse, item2, person2, 5000.0, 5700.0,
                100.0, LocalDate.now().plusDays(1));
        Lot lot3 = createLot(auctionHouse, item3, person3, 9000.0, 9001.0,
                200.0, LocalDate.now().plusDays(2));

        final Set<Lot> lots = new HashSet<>();
        lots.add(lot1);
        lots.add(lot2);
        lots.add(lot3);
        //auctionHouse.setLots(lots);
        auctionService.save(auctionHouse);
    }

    private AuctionHouse createAuctionHouse(String name) {
        AuctionHouse auctionHouse = new AuctionHouse();
        auctionHouse.setName(name);
        return auctionHouse;
    }

    private Item createItem(String name, ItemType type) {
        Item item = new Item();
        item.setName(name);
        item.setType(type);
        itemService.save(item);
        return item;
    }

    private Person createPerson(String name, Double money) {
        Person person = new Person();
        person.setName(name);
        person.setMoney(money);
        personService.save(person);
        return person;
    }

    private Lot createLot(AuctionHouse auctionHouse,
                          Item item,
                          Person seller,
                          Double originPrice,
                          Double bidPrice,
                          Double minStep,
                          LocalDate expireDate) {
        Lot lot = new Lot();
        lot.setAuctionHouse(auctionHouse);
        lot.setItem(item);
        lot.setSeller(seller);
        lot.setOriginPrice(originPrice);
        lot.setBidPrice(bidPrice);
        lot.setMinStep(minStep);
        lot.setExpireDate(expireDate);
        lotService.save(lot);
        return lot;
    }
}
