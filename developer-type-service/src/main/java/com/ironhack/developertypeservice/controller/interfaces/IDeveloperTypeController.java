package com.ironhack.developertypeservice.controller.interfaces;

import com.ironhack.developertypeservice.controller.dto.DeveloperTypeDTO;
import com.ironhack.developertypeservice.controller.dto.DeveloperTypeListDTO;

public interface IDeveloperTypeController {

    DeveloperTypeDTO getDeveloperTypes(Long id);

    DeveloperTypeListDTO storeDeveloperType(Long id, DeveloperTypeListDTO developerTypesList);

}
