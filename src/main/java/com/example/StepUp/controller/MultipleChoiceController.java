package com.example.StepUp.controller;

import com.example.StepUp.Entity.MultipleChoice;
import com.example.StepUp.Services.MultipleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/multipleChoice")
public class MultipleChoiceController {

    @Autowired
    private MultipleChoiceService MultipleChoiceService;

    @GetMapping
    public List<MultipleChoice> findAll()
    {
        return  MultipleChoiceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MultipleChoice> findById(@PathVariable(value = "id") int id)
    {
        Optional<MultipleChoice> MultipleChoice= MultipleChoiceService.findById(id);
        if(MultipleChoice.isPresent())
            return ResponseEntity.ok().body(MultipleChoice.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public MultipleChoice save(@RequestBody MultipleChoice MultipleChoice)
    {
        return MultipleChoiceService.save(MultipleChoice);
    }
}
