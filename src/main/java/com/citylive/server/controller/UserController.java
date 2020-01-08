package com.citylive.server.controller;

import com.citylive.server.domain.User;
import com.citylive.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(@Autowired final UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody @Validated User user){
        return userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/jpa")
    public User addUserWithJPA(@RequestBody @Validated User user){
        return userService.addUserWithJPA(user);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/jpa/update")
    public void updateUserWithJPA(@RequestBody @Validated User user){
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/jpa/find")
    public Optional<User> findByUserName(String userName){
        return userService.findByUserName(userName);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/jpa/delete")
    public void delete(String userName){
        userService.delete(userName);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public Iterable<User> getAllUser(){
        return userService.getAllUser();
    }
}
