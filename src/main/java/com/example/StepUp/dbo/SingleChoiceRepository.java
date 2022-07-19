package com.example.StepUp.dbo;

import com.example.StepUp.Entity.SingleChoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SingleChoiceRepository extends MongoRepository<SingleChoice,Integer> {
}
