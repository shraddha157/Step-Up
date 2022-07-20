package com.example.StepUp.Services;

import com.example.StepUp.Entity.Course;
import com.example.StepUp.dbo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll()
    {
        return courseRepository.findAll();
    }

    public Optional<Course> findById(int id)
    {
        Optional<Course> course= courseRepository.findById(id);
        if(course.isPresent())
        {
            ArrayList<Integer> actId=course.get().getActivityIdList();
            return course;
        }
        else
            return null;
    }

    public Course saveCourse(Course course)
    {
       return courseRepository.save(course);
    }

    public List<Course> saveCourses(List<Course> course){ return courseRepository.saveAll(course);}
}
