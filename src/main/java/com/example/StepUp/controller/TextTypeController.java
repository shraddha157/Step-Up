package com.example.StepUp.controller;

import com.example.StepUp.Entity.TextType;
import com.example.StepUp.Services.TextTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Text;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/textType")
public class TextTypeController {

    @Autowired
    private TextTypeService textTypeService;

    @GetMapping
    public List<TextType> findAll()
    {
        return textTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TextType> findById(@PathVariable(value = "id") int id)
    {
        Optional<TextType> textType= textTypeService.findById(id);
        if(textType.isPresent())
            return ResponseEntity.ok().body(textType.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping
    public TextType save(@RequestBody TextType textType)
    {
        return textTypeService.saveTextType(textType);
    }
}
