package com.ironhack.edgeservice.service.interfaces;

import com.ironhack.edgeservice.models.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getAll();

    Course getCourseById(Long id);
}
