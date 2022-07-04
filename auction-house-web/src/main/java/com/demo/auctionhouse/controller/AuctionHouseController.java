package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.service.AuctionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/auction-houses")
public class AuctionHouseController {

    private AuctionService auctionService;

    @RequestMapping({"/", ""})
    public String list(Model model) {
        model.addAttribute("auction_houses", auctionService.findAll());
        return "auctionhouse/index";
    }

}
