package com.ironhack.edgeservice.controller.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {
    private String username;
    private String password;

    //public <R> void setRoles(Set<R> collect) {}
}
