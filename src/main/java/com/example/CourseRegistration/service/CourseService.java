package com.example.CourseRegistration.service;

import com.example.CourseRegistration.model.Course;
import com.example.CourseRegistration.repositary.CouserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CouserRepo couserRepo;

    public List<Course> getAvailableCourse() {
        return couserRepo.findAll();
    }
}
