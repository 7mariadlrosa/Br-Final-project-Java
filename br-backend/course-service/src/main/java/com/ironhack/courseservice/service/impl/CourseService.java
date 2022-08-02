package com.ironhack.courseservice.service.impl;

import com.ironhack.courseservice.model.Course;
import com.ironhack.courseservice.repository.CourseRepository;
import com.ironhack.courseservice.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    public CourseRepository courseRepository;


    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

}