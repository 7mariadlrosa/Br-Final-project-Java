package com.ironhack.developertypeservice.service.interfaces;

import com.ironhack.developertypeservice.controller.dto.DeveloperTypeDTO;
import com.ironhack.developertypeservice.controller.dto.DeveloperTypeListDTO;

public interface IDeveloperTypeService {

    DeveloperTypeDTO getDeveloperTypes(Long id);

    DeveloperTypeListDTO storeDeveloperType(Long id, DeveloperTypeListDTO developerTypeList);
}
