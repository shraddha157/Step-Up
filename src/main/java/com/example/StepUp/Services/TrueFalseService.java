package com.example.StepUp.Services;

import com.example.StepUp.Entity.TextType;
import com.example.StepUp.Entity.TrueFalseType;
import com.example.StepUp.dbo.TextTypeRepository;
import com.example.StepUp.dbo.TrueFalseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrueFalseService {
    @Autowired
    private TrueFalseRepository trueFalseRepository;

    public List<TrueFalseType> findAll()
    {
        return trueFalseRepository.findAll();
    }

    public Optional<TrueFalseType> findById(int id)
    {
        return trueFalseRepository.findById(id);
    }

    public TrueFalseType save(TrueFalseType trueFalseType)
    {
        return trueFalseRepository.save(trueFalseType);
    }
}
