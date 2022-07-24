package com.example.StepUp.controller;

import com.example.StepUp.Entity.Activity;
import com.example.StepUp.Services.ActivityService;
import com.example.StepUp.dbo.CourseRepository;
import com.example.StepUp.Entity.Course;
//import com.example.dbo.TextRepository;
//import com.example.response.ResponseHandler;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import com.example.StepUp.Services.CourseService;

import javax.swing.text.html.Option;
import java.util.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

//    @Autowired
//    private TextRepository textRepository;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ActivityService activityService;



    @GetMapping
    public List<Course> findAll()
    {
        System.out.println("received find all request");
        return courseService.findAll();
        //need to send list of courses if available otherwise a msg "No course available"
    }

    @PutMapping
    public  ResponseEntity<Course> addCourseId(@RequestParam(name = "courseId") String courseId, @RequestParam(name = "activityId") String activityId)
    {
        try {
            int cid= Integer.parseInt(courseId);
            int aid=Integer.parseInt(activityId);
            Optional<Course> course = courseService.findByIdAndAddCourse(cid, aid);
            return ResponseEntity.of(Optional.of(course.get()));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid id given");
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/custom/{id}")
    public Map<String,String> findByIdCustom(@PathVariable(value = "id") String id)
    {
        try {
            int cid = Integer.parseInt(id);
            Optional<Course> course=courseService.findById(cid);
            Map<String,String> tempMap= new HashMap<>();
            Map<String, Object> tempMap2= new HashMap<>();
            tempMap.put("courseId",course.get().getId()+" ");
            //tempMap2.put("courseId",new String(course.get().getId()));
            tempMap.put("name",course.get().getName());
            ArrayList<Integer> activityList= course.get().activityIdList;
            int num=0;
            for(int aid:activityList)
            {
                Optional<Activity> activity= activityService.findById(aid);
                //tempMap2.put("activity"+num,activity.get().toString())
                tempMap.put("toString"+num,activity.get().toString());
                tempMap.put("activityId"+num,activity.get().getId()+"");
                tempMap.put("type"+num,activity.get().getType()+"");
                tempMap.put("questionId"+num,activity.get().getQuestionId()+"");
                num++;
            }
            return tempMap;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Course Id");
            return null;
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> findCourseById(@PathVariable(value= "id") String id){
        try {
            int d = Integer.parseInt(id);
            Optional<Course> course = courseService.findById(d);
            return ResponseEntity.of(Optional.of(course.get()));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Course Id");
            return ResponseEntity.status(500).build();
        }
    }


    @CrossOrigin(origins = "http://localhost:9090")
    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        try {
            Course c = courseService.saveCourse(course);
            return ResponseEntity.of(Optional.of(c));
        } catch (HttpMessageNotReadableException e) {
            System.out.println("Invalid input");
            return ResponseEntity.status(500).build();
        }
    }
    @CrossOrigin(origins = "http://localhost:9090")
    @PostMapping("/savecourses")
    public ResponseEntity<List<Course>> saveCourses(@RequestBody List<Course> courses) {
        try {
            List<Course> c = courseService.saveCourses(courses);
            return ResponseEntity.of(Optional.of(c));
        } catch (HttpMessageNotReadableException e) {
            System.out.println("Invalid Input ");
            return ResponseEntity.status(500).build();
        }
    }

}
