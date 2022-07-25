package com.ironhack.developertypeservice.repository;

import com.ironhack.developertypeservice.model.DeveloperType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperTypeRepository extends JpaRepository<DeveloperType, Integer> {

    @Query
    List<String> findDeveloperTypesById(Long id);

}
