package com.example.StepUp.controller;

import com.example.StepUp.Entity.SingleChoice;
import com.example.StepUp.Services.SingleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/singleChoice")
public class SingleChoiceController {

    @Autowired
    private SingleChoiceService singleChoiceService;

    @GetMapping
    public List<SingleChoice> findAll()
    {
        return  singleChoiceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SingleChoice> findById(@PathVariable(value = "id") int id)
    {
        Optional<SingleChoice> singleChoice= singleChoiceService.findById(id);
        if(singleChoice.isPresent())
            return ResponseEntity.ok().body(singleChoice.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public SingleChoice save(@RequestBody SingleChoice singleChoice)
    {
        return singleChoiceService.save(singleChoice);
    }
}
