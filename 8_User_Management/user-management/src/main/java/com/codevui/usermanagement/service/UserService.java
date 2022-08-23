package com.codevui.usermanagement.service;

import java.util.List;

import com.codevui.usermanagement.exception.custom.CustomBadRequestException;
import com.codevui.usermanagement.exception.custom.CustomNotFoundException;
import com.codevui.usermanagement.model.dto.UserDTO;
import com.codevui.usermanagement.model.dto.UserDTOCreate;
import com.codevui.usermanagement.model.dto.UserDTOUpdate;

public interface UserService {

    public List<UserDTO> getAllUsers();

    public UserDTO getUserById(int id) throws CustomNotFoundException;

    public UserDTO createUser(UserDTOCreate userDTOCreate) throws CustomBadRequestException;

    public UserDTO updateUser(UserDTOUpdate userDTOUpdate);

    public UserDTO deleteUser(int id) throws CustomNotFoundException;

}
