package com.ironhack.lenguageservice.service.interfaces;

import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;

public interface ILenguageService {

   LenguageDTO getLenguages(Long id);

   LenguageListDTO storeLenguage(Long id, LenguageListDTO lenguageList);
}
