package com.example.StepUp.dbo;

import com.example.StepUp.Entity.TrueFalseType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrueFalseRepository extends MongoRepository<TrueFalseType,Integer> {
}
