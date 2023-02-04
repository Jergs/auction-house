package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.UserDetails;
import com.demo.auctionhouse.repository.UserRepository;
import com.demo.auctionhouse.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("jpa")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Set<UserDetails> findAll() {
        return new HashSet<>(userRepository.findAll());
    }

    @Override
    public UserDetails findById(Long aLong) {
        return userRepository.findById(aLong).orElse(null);
    }

    @Override
    public UserDetails save(UserDetails object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(UserDetails object) {
        userRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        userRepository.deleteById(aLong);
    }

    @Override
    public UserDetails findByName(String name) {
        return userRepository.findByName(name);
    }
}
