package com.example.controller;

import com.example.dbo.CourseRepository;
import com.example.Entity.Course;
import com.example.dbo.TextRepository;
import com.example.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Services.CourseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TextRepository textRepository;

    @Autowired
    private CourseService courseService;



    @GetMapping
    public List<Course> findAll()
    {
        System.out.println("received find all request");
        return courseService.findAll();
        //return (List<Course>) courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> findCourseById(@PathVariable(value= "id") int id){
       return courseService.findById(id);
    }


    @CrossOrigin(origins = "http://localhost:9090")
    @PostMapping
    public Course saveCourse(@RequestBody Course course)
    {
        return courseService.saveCourse(course);
    }
}
