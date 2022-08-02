package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.controller.interfaces.ICourseController;
import com.ironhack.edgeservice.models.Course;
import com.ironhack.edgeservice.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        System.out.println("HOLA ESTAMOS ENE LE CONTROLADOR --------------------------------------------------------->>>>>>>>>>>");
        return courseService.getAll();
    }

    @GetMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);}


 /* public ResponseEntity<Course> getCourseById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Course course = courseService.getById(id);
        return ResponseEntity.ok().body(course);
    }

    */
}