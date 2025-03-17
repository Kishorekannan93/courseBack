package com.example.CourseRegistration.repositary;

import com.example.CourseRegistration.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouserRepo extends JpaRepository<Course,Integer>   {

}
