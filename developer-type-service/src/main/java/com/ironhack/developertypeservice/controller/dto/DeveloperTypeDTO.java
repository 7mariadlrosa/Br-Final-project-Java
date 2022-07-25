package com.ironhack.developertypeservice.controller.dto;

import java.util.List;

public class DeveloperTypeDTO {

    private List<String> developerTypes;


    public List<String> getDeveloperTypes() {
        return developerTypes;
    }

    public static void setDeveloperTypes(List<String> developerTypes) {
        this.developerTypes = developerTypes;
    }
}
