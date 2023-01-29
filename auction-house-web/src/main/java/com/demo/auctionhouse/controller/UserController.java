package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.model.User;
import com.demo.auctionhouse.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping({"/detail"})
    public String listItems(Model model) {
        model.addAttribute("users", userService.findAll()
                .stream()
                .sorted(Comparator.comparing(User::getId))
                .collect(Collectors.toList()));
        return "/user/detail";
    }

}
