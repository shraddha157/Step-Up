package com.example.dbo;

import com.example.Entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends MongoRepository<Course,Integer> {
}
