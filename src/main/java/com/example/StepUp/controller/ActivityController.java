package com.example.StepUp.controller;

import com.example.StepUp.Entity.Activity;
import com.example.StepUp.Services.ActivityService;
import com.example.StepUp.dbo.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> findAll()
    {
        return activityService.findAll();
    }

//    @GetMapping("/content/{id}")
//    public ResponseEntity<>
    @GetMapping("/{id}")
    public ResponseEntity<Activity> findById(@PathVariable(value="id") int id)
    {
        Optional<Activity> activity=activityService.findById(id);
        if(activity.isPresent())
        {
            return ResponseEntity.ok().body(activity.get());
        }
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Activity saveActivity(@RequestBody Activity activity)
    {
       return activityService.saveActivity(activity);
    }
}
