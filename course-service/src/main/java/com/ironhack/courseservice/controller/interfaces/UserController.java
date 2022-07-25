package com.ironhack.courseservice.controller.interfaces;

import com.ironhack.courseservice.controller.dto.UserDTO;
import com.ironhack.courseservice.model.User;

import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);
}
