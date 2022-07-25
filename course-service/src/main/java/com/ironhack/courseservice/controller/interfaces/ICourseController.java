package com.ironhack.courseservice.controller.interfaces;

import com.ironhack.courseservice.model.Course;

import java.util.List;

public interface ICourseController {

    List<Course> getAll();
}