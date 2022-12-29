package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/detail")
@AllArgsConstructor
public class UserDetailController {

    private final UserService userService;

    @RequestMapping({"/", ""})
    public String listItems(Model model) {
        //TODO Change to user details
        model.addAttribute("users", userService.findAll());
        return "/items/index";
    }

}
