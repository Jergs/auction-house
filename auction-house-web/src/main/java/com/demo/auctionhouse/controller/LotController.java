package com.demo.auctionhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lots")
@Controller
public class LotController {

    @RequestMapping({"/", ""})
    public String listItems() {
        return "lots/index";
    }
}
