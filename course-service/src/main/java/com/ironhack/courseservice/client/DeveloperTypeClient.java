package com.ironhack.courseservice.client;

import com.ironhack.developertypeservice.controller.dto.DeveloperTypeDTO;
import com.ironhack.developertypeservice.controller.dto.DeveloperTypeListDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("developer-type-service")
public interface DeveloperTypeClient {

    @GetMapping("/developer-type/{id}")
    DeveloperTypeDTO getDeveloperTypes(@PathVariable Long id);

    @PostMapping("/developer-type/{id}")
    void storeDeveloperType(@PathVariable Long id, @RequestBody DeveloperTypeListDTO developerTypeList);

}
