package com.example.CourseRegistration.controller;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://kishorekannan93.github.io")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/course")
    public List<Course> getAvailableCourse(){
        return courseService.getAvailableCourse();
    }



}
