package com.example.nba.controller;

import com.example.nba.model.Composition;
import com.example.nba.repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/composition")
public class CompositionController{
    @Autowired
    private CompositionRepository compositionRepository;
    @GetMapping()
    public List<Composition> getcomposition() {
        return compositionRepository.findAll();
    }

    @PostMapping()
    public Composition create(@RequestBody Composition composition) {
        return compositionRepository.save(composition);
    }
}
