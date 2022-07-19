package com.example.StepUp.dbo;

import com.example.StepUp.Entity.TextType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TextTypeRepository extends MongoRepository<TextType, Integer> {
}
