package com.example.StepUp.controller;

import com.example.StepUp.Entity.TrueFalseType;
import com.example.StepUp.Services.TrueFalseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trueFalse")
public class TrueFalseTypeController {

    @Autowired
    private TrueFalseService trueFalseService;

    @GetMapping
    public List<TrueFalseType> findAll()
    {
        return  trueFalseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrueFalseType> findById(@PathVariable(value = "id") int id)
    {
        Optional<TrueFalseType> trueFalseType= trueFalseService.findById(id);
        if(trueFalseType.isPresent())
            return ResponseEntity.ok().body(trueFalseType.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public TrueFalseType save(@RequestBody TrueFalseType trueFalseType)
    {
        return trueFalseService.save(trueFalseType);
    }
}
