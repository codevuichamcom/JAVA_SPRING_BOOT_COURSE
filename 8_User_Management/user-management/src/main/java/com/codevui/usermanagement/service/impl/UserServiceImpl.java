package com.codevui.usermanagement.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codevui.usermanagement.entity.User;
import com.codevui.usermanagement.exception.custom.CustomBadRequestException;
import com.codevui.usermanagement.exception.custom.CustomNotFoundException;
import com.codevui.usermanagement.model.CustomError;
import com.codevui.usermanagement.model.dto.UserDTO;
import com.codevui.usermanagement.model.dto.UserDTOCreate;
import com.codevui.usermanagement.model.dto.UserDTOUpdate;
import com.codevui.usermanagement.model.mapper.UserMapper;
import com.codevui.usermanagement.repository.UserRepository;
import com.codevui.usermanagement.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = new ArrayList<>();

        List<User> users = userRepository.findAll();

        for (User user : users) {
            userDTOs.add(UserMapper.toUserDTO(user));
        }
        return userDTOs;
    }

    @Override
    public UserDTO getUserById(int id) throws CustomNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new CustomNotFoundException(
                    CustomError.builder().code("404").message("getUserById - User not found").build());
        }
        return UserMapper.toUserDTO(userOptional.get());
    }

    @Override
    public UserDTO createUser(UserDTOCreate userDTOCreate) throws CustomBadRequestException {
        if (userDTOCreate.getEmail().equals("")) {
            throw new CustomBadRequestException(CustomError.builder().code("400").message("Email not blank").build());
        }
        User user = UserMapper.toUser(userDTOCreate);
        user = userRepository.save(user);
        return UserMapper.toUserDTO(user);
    }

    @Override
    public UserDTO updateUser(UserDTOUpdate userDTOUpdate) {
        User user = UserMapper.toUser(userDTOUpdate);
        user = userRepository.save(user);
        return UserMapper.toUserDTO(user);
    }

    @Override
    public UserDTO deleteUser(int id) throws CustomNotFoundException {

        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new CustomNotFoundException(CustomError.builder().code("404").message("User not found").build());
        }
        userRepository.deleteById(id);
        return UserMapper.toUserDTO(userOptional.get());
    }

}
