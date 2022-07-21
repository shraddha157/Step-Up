package com.example.StepUp.dbo;

import com.example.StepUp.Entity.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity, Integer> {
}
