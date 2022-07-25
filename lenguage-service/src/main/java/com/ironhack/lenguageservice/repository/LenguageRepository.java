package com.ironhack.lenguageservice.repository;

import com.ironhack.lenguageservice.model.Lenguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LenguageRepository extends JpaRepository<Lenguage, Integer> {
    @Query
    List<String> findLenguagesById(Long id);
}
