package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.service.LotService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lots")
@AllArgsConstructor
public class LotController {

    private final LotService lotService;

    @RequestMapping({"/", ""})
    public String listLots(Model model) {
        model.addAttribute("lots", lotService.findAll());
        return "/lots/index";
    }
}
