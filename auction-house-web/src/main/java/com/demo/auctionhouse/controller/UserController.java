package com.demo.auctionhouse.controller;

import com.demo.auctionhouse.model.UserDetails;
import com.demo.auctionhouse.service.UserService;
import java.util.Comparator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.findAll()
                .stream()
                .sorted(Comparator.comparing(UserDetails::getId))
                .toList());
        return "/users/index";
    }

//    @RequestMapping({"/detail"})
//    public String userDetails(Model model) {
//        model.addAttribute("users", userService.findAll()
//                .stream()
//                .sorted(Comparator.comparing(UserDetails::getId))
//                .toList());
//        return "/user/detail";
//    }

}
