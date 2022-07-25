package com.ironhack.lenguageservice.controller.impl;


import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;
import com.ironhack.lenguageservice.controller.interfaces.ILenguageController;

import com.ironhack.lenguageservice.service.interfaces.ILenguageService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class LenguageController implements ILenguageController {

    @Autowired
    private ILenguageService lenguageService;

    @Override
    public LenguageDTO getLenguages(Long id) {
        return null;
    }

    @Override
    public LenguageListDTO storeLenguage(Long id, LenguageListDTO lenguagesList) {
        return null;
    }
}