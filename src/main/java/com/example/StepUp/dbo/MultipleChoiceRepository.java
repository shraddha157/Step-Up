package com.example.StepUp.dbo;

import com.example.StepUp.Entity.MultipleChoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MultipleChoiceRepository extends MongoRepository<MultipleChoice,Integer> {
}
