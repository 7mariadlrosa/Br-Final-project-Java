package com.ironhack.lenguageservice.service.impl;

import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;
import com.ironhack.lenguageservice.model.Lenguage;
import com.ironhack.lenguageservice.repository.LenguageRepository;
import com.ironhack.lenguageservice.service.interfaces.ILenguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LenguageService implements ILenguageService {

    @Autowired
    private LenguageRepository lenguageRepository;


    public LenguageDTO getLenguages(Long id) {
        List<String> lenguages = checkLenguages(id);
        LenguageDTO lenguageDTO = new LenguageDTO();
        lenguageDTO.setLenguages(lenguages);
        return lenguageDTO;
    }

    public LenguageListDTO storeLenguage(Long id, LenguageListDTO lenguageList) {
        for (String i : lenguageList.getLenguagesList()) {
            Lenguage lenguage = new Lenguage();
            lenguageRepository.save(lenguage);
        }
        LenguageListDTO lenguageListDTO = new LenguageListDTO();
        lenguageListDTO.setLenguagesList(lenguageRepository.findLenguagesById(id));
        return lenguageListDTO;
    }

    private List<String> checkLenguages(Long id) {
        List<String> lenguages = lenguageRepository.findLenguagesById(id);
        if (lenguages.size() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return lenguages;
    }

}