package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @RequestMapping({"/", "", "/find"})
    public String listItems(Model model) {
        model.addAttribute("items", itemService.findAll());
        return "items/index";
    }
}
