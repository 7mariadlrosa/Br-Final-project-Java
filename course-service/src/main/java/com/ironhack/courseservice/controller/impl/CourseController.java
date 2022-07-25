package com.ironhack.courseservice.controller.impl;


import com.ironhack.courseservice.controller.interfaces.ICourseController;
import com.ironhack.courseservice.model.Course;
import com.ironhack.courseservice.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController implements ICourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getAll() {
        return courseService.getAll();
    }

    /*@GetMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getAll() {
        return courseService.getAll();
    }*/
}