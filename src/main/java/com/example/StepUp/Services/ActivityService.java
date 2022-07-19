package com.example.StepUp.Services;

import com.example.StepUp.Entity.Activity;
import com.example.StepUp.dbo.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> findAll()
    {
        return activityRepository.findAll();
    }
    public Optional<Activity> findById(int id)
    {
        Optional<Activity> activity= activityRepository.findById(id);
        if(activity.isPresent()){
            return activity;
        }
        else
            return null;
    }
    public Activity saveActivity(Activity activity)
    {
        return activityRepository.save(activity);
    }
}
