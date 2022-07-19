package com.example.StepUp.Services;

import com.example.StepUp.Entity.TextType;
import com.example.StepUp.dbo.TextTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class TextTypeService {

    @Autowired
    private TextTypeRepository textTypeRepository;

    public List<TextType> findAll()
    {
        return textTypeRepository.findAll();
    }

    public Optional<TextType> findById(int id)
    {
        return textTypeRepository.findById(id);
    }

    public TextType saveTextType(TextType textType)
    {
        return textTypeRepository.save(textType);
    }
}
