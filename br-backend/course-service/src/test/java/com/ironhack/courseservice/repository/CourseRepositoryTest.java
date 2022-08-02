package com.ironhack.courseservice.repository;

import com.ironhack.courseservice.model.Course;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

@BeforeEach
void setUp(){

}

    @AfterEach
    void tearDown(){

    }

    @Test
    void test_JPAMethods(){
    List<Course> courseList = courseRepository.findAll();
    }
}
