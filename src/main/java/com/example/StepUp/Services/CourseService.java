package com.example.StepUp.Services;

import com.example.StepUp.Entity.Course;
import com.example.StepUp.dbo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll()
    {
        return (List<Course>)courseRepository.findAll();
    }

    public ResponseEntity<Course> findById(int id)
    {
        Optional<Course> course= courseRepository.findById(id);

        if(course.isPresent())
        {
            ArrayList<Integer> actId=course.get().getActivityIdList();
            //Fetching id of activity from here stored in actId
            //Task is to fetch question using this id and fetch textType activity using textRepository
            //and return a JSON like this:
            /*
               {
                  "id": course.id,
                  "name": course.name,
                  "activity": {
                      "id": textType.id,
                      "type": textType.type,
                      "content": textType.content
                  }
               }
             */
            //Here activity array will be storing multiple activities in future.
            //return ResponseHandler.generateResponse(textRepository.findById(actId), HttpStatus.OK,course);
            return ResponseEntity.ok().body(course.get());
        }
        else
            return ResponseEntity.status(500).build();
    }

    public Course saveCourse(Course course)
    {
       return courseRepository.save(course);
    }
}
