package com.ironhack.courseservice.client;

import com.ironhack.lenguageservice.controller.dto.LenguageDTO;
import com.ironhack.lenguageservice.controller.dto.LenguageListDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("lenguage-service")
public interface LenguageClient {

    //@GetMapping("/lenguages")
    //LenguageDTO getLenguages;

    @GetMapping("/lenguage/{id}")
    LenguageDTO getLenguages(@PathVariable Long id);

    @PostMapping("/lenguage/{id}")
    void storeLenguage(@PathVariable Long id, @RequestBody LenguageListDTO lenguageList);

}
