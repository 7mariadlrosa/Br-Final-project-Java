package com.ironhack.courseservice.service.interfaces;

import com.ironhack.courseservice.controller.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO store(UserDTO user);
    List<UserDTO> findAll();
}