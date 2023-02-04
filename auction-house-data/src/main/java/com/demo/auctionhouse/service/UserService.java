package com.demo.auctionhouse.service;

import com.demo.auctionhouse.model.UserDetails;

public interface UserService extends CrudService<UserDetails, Long> {

    UserDetails findByName(String name);
}
