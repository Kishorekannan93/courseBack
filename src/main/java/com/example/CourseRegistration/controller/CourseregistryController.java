package com.example.CourseRegistration.controller;

import com.example.CourseRegistration.model.CourseRegistry;
import com.example.CourseRegistration.service.CourseRegistryservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://kishorekannan93.github.io")
@Validated
public class CourseregistryController {

    @Autowired
    CourseRegistryservice courseRegistryservice;


    @GetMapping("/course/enrolled")
    public List<CourseRegistry> getEnrolledstd(){
        return courseRegistryservice.getEnrolledStd();
    }
    @PostMapping("/register")
    public String addNewcourse(@Valid @RequestBody CourseRegistry request){
         courseRegistryservice.addNewcourse(request.getName(), request.getEmailId(), request.getCourseName());
         return "Congratulations!!!"+request.getName()+" Enrollment Successfull for "+request.getCourseName();
    }

}
