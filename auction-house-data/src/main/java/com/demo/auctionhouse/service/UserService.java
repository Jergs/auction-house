package com.demo.auctionhouse.service;

import com.demo.auctionhouse.model.User;

public interface UserService extends CrudService<User, Long> {

    User findByName(String name);
}
