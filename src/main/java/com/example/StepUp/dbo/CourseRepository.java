package com.example.StepUp.dbo;

import com.example.StepUp.Entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,Integer> {
}
