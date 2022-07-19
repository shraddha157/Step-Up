package com.example.StepUp.controller;

import com.example.StepUp.dbo.CourseRepository;
import com.example.StepUp.Entity.Course;
//import com.example.dbo.TextRepository;
//import com.example.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.StepUp.Services.CourseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

//    @Autowired
//    private TextRepository textRepository;

    @Autowired
    private CourseService courseService;



    @GetMapping
    public List<Course> findAll()
    {
        System.out.println("received find all request");
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> findCourseById(@PathVariable(value= "id") String id){
        try {
            int d = Integer.parseInt(id);
            Course course = courseService.findById(d);
            return ResponseEntity.of(Optional.of(course));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Course Id");
            return ResponseEntity.status(500).build();
        }
    }


    @CrossOrigin(origins = "http://localhost:9090")
    @PostMapping
    public Course saveCourse(@RequestBody Course course)
    {
        return courseService.saveCourse(course);
    }
}
