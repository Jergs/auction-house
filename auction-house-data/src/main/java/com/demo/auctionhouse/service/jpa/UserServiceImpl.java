package com.demo.auctionhouse.service.jpa;

import com.demo.auctionhouse.model.User;
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
    public Set<User> findAll() {
        return new HashSet<>(userRepository.findAll());
    }

    @Override
    public User findById(Long aLong) {
        return userRepository.findById(aLong).orElse(null);
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {
        userRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        userRepository.deleteById(aLong);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
