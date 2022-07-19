package com.example.StepUp.Services;


import com.example.StepUp.Entity.MultipleChoice;
import com.example.StepUp.dbo.MultipleChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultipleChoiceService {

    @Autowired
    private MultipleChoiceRepository MultipleChoiceRepository;

    public List<MultipleChoice> findAll()
    {
        return MultipleChoiceRepository.findAll();
    }

    public Optional<MultipleChoice> findById(int id)
    {
        return MultipleChoiceRepository.findById(id);
    }

    public MultipleChoice save(MultipleChoice MultipleChoice)
    {
        return MultipleChoiceRepository.save(MultipleChoice);
    }

}
