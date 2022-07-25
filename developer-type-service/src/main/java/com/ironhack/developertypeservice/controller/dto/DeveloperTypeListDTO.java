package com.ironhack.developertypeservice.controller.dto;

import java.util.List;

public class DeveloperTypeListDTO {

    private List<String> developerTypesList;


    public List<String> getDeveloperTypesList() {
        return developerTypesList;
    }

    public void setDeveloperTypesList(List<String> developerTypesList) {
        this.developerTypesList = developerTypesList;
    }
}
