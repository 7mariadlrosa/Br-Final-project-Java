package com.ironhack.developertypeservice.service.impl;

import com.ironhack.developertypeservice.controller.dto.DeveloperTypeDTO;
import com.ironhack.developertypeservice.controller.dto.DeveloperTypeListDTO;
import com.ironhack.developertypeservice.model.DeveloperType;
import com.ironhack.developertypeservice.repository.DeveloperTypeRepository;
import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;
import com.ironhack.lenguageservice.model.Lenguage;
import com.ironhack.lenguageservice.repository.LenguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeveloperTypeService {

    @Autowired
    private DeveloperTypeRepository developerTypeRepository;


    public DeveloperTypeDTO getDeveloperTypes(Long id) {
        List<String> developerTypes = checkDeveloperTypes(id);
        DeveloperTypeDTO developerTypeDTO = new DeveloperTypeDTO();
        DeveloperTypeDTO.setDeveloperTypes(developerTypes);
        return developerTypeDTO;
    }

    public DeveloperTypeListDTO storeLenguage(Long id, DeveloperTypeListDTO developerTypeList) {
        for (String i : developerTypeList.getDeveloperTypesList()) {
            DeveloperType developerType = new DeveloperType();
            developerTypeRepository.save(developerType);
        }
        DeveloperTypeListDTO developerTypeListDTO = new DeveloperTypeListDTO();
        developerTypeListDTO.setDeveloperTypesList(developerTypeRepository.findDeveloperTypesById(id));
        return developerTypeListDTO;
    }

    private List<String> checkDeveloperTypes(Long id) {
        List<String> developerTypes = developerTypeRepository.findDeveloperTypesById(id);
        if (developerTypes.size() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return developerTypes;
    }

}
