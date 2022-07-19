package com.example.StepUp.Services;


import com.example.StepUp.Entity.SingleChoice;
import com.example.StepUp.dbo.SingleChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class SingleChoiceService {

    @Autowired
    private SingleChoiceRepository singleChoiceRepository;

    public List<SingleChoice> findAll()
    {
        return singleChoiceRepository.findAll();
    }

    public Optional<SingleChoice> findById(int id)
    {
        return singleChoiceRepository.findById(id);
    }

    public SingleChoice save(SingleChoice singleChoice)
    {
        return singleChoiceRepository.save(singleChoice);
    }

}
