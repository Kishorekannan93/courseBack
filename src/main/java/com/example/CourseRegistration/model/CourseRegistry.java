package com.example.CourseRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.lang.model.util.Elements;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "email is required")
    @Pattern(
            regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "Invalid email format"
    )
    private String emailId;
    @NotBlank(message = "couursename is required")
    private String courseName;

    public CourseRegistry( String name, String emailId, String courseName) {

        this.name = name;

        this.emailId = emailId;
        this.courseName = courseName;
    }
}
