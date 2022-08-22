package com.demo.auctionhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lots")
public class LotController {

    @RequestMapping({"/", ""})
    public String listLots() {
        return "/lots/index";
    }
}
