package com.example.CourseRegistration.service;


import com.example.CourseRegistration.model.CourseRegistry;
import com.example.CourseRegistration.repositary.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistryservice {

    @Autowired
    CourseRegistryRepo courseRegistryRepo;


    public List<CourseRegistry> getEnrolledStd() {
       return courseRegistryRepo.findAll();
    }

    public void addNewcourse(String name, String emailId,String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
         courseRegistryRepo.save(courseRegistry);
    }
}
