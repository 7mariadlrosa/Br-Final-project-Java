package com.ironhack.developertypeservice.controller.impl;

import com.ironhack.developertypeservice.controller.dto.DeveloperTypeDTO;
import com.ironhack.developertypeservice.controller.dto.DeveloperTypeListDTO;
import com.ironhack.developertypeservice.controller.interfaces.IDeveloperTypeController;
import com.ironhack.developertypeservice.service.interfaces.IDeveloperTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperTypeController implements IDeveloperTypeController {

    @Autowired
    private IDeveloperTypeService developerTypeService;

    @Override
    public DeveloperTypeDTO getDeveloperTypes(Long id) {
        return null;
    }

    @Override
    public DeveloperTypeListDTO storeDeveloperType(Long id, DeveloperTypeListDTO developerTypeList) {
        return null;
    }

}
