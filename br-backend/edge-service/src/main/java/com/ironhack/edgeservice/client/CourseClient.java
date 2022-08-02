package com.ironhack.edgeservice.client;


import com.ironhack.edgeservice.models.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("course-service")
public interface CourseClient {

    @GetMapping("/courses")
    List<Course> getAll();

    @GetMapping("/courses/{id}")
    Course getCourseById(@PathVariable Long id);
}
