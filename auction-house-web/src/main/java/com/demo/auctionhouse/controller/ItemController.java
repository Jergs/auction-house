package com.demo.auctionhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

    @RequestMapping({"/", ""})
    public String listItems() {
        return "items/index";
    }
}
