package com.codevui.usermanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codevui.usermanagement.entity.User;
import com.codevui.usermanagement.exception.custom.CustomBadRequestException;
import com.codevui.usermanagement.exception.custom.CustomNotFoundException;
import com.codevui.usermanagement.model.dto.UserDTO;
import com.codevui.usermanagement.model.dto.UserDTOCreate;
import com.codevui.usermanagement.model.dto.UserDTOUpdate;
import com.codevui.usermanagement.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users") // root enpoint
public class UserController {
    private final UserService userService;

    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable int id) throws CustomNotFoundException {
        return userService.getUserById(id);
    }

    @PostMapping("")
    public UserDTO createUser(@RequestBody UserDTOCreate userDTOCreate) throws CustomBadRequestException {
        return userService.createUser(userDTOCreate);
    }

    @PutMapping("/{id}")
    public UserDTO createUser(@PathVariable int id, @RequestBody UserDTOUpdate userDTOUpdate) {
        userDTOUpdate.setId(id);
        return userService.updateUser(userDTOUpdate);
    }

    @DeleteMapping("/{id}")
    public UserDTO createUser(@PathVariable int id) throws CustomNotFoundException {
        return userService.deleteUser(id);
    }
}
