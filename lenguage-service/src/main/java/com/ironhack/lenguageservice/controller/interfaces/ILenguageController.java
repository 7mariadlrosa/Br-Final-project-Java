package com.ironhack.lenguageservice.controller.interfaces;


import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;

public interface ILenguageController {

    LenguageDTO getLenguages(Long id);

    LenguageListDTO storeLenguage(Long id, LenguageListDTO lenguagesList);

}