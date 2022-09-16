package com.restfulws.springmvvjpa.restfulappspring.controller;

import com.restfulws.springmvvjpa.restfulappspring.model.request.UserDetailsRequestModel;
import com.restfulws.springmvvjpa.restfulappspring.model.response.UserRest;
import com.restfulws.springmvvjpa.restfulappspring.service.UserService;
import com.restfulws.springmvvjpa.restfulappspring.shared.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/{id}")
    private UserRest getUser(@PathVariable String id){
        UserRest returnValue = new UserRest();

        UserDto userDto  = userService.getUserByUserId(id);

        BeanUtils.copyProperties(userDto, returnValue);

        return returnValue;
    }

    @PostMapping
    private UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){

        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    private String updateUser(){
        return "Hello PUT";
    }

    @DeleteMapping
    private String deleteUser(){
        return "Hello DELETE";
    }
}
