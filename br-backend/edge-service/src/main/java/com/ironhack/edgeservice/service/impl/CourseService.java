package com.ironhack.edgeservice.service.impl;

import com.ironhack.edgeservice.client.CourseClient;
import com.ironhack.edgeservice.models.Course;
import com.ironhack.edgeservice.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    public CourseClient courseClient;

    @Override
    public List<Course> getAll() {
        return courseClient.getAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseClient.getCourseById(id);
    }

}