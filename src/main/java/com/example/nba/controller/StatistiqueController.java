package com.example.nba.controller;

import com.example.nba.model.StatParMatch;
import com.example.nba.model.Statistique;
import com.example.nba.repository.StatistiqueRepository;
import com.example.nba.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stat")
public class StatistiqueController {
    @Autowired
    StatistiqueRepository statistiqueRepository;
    @Autowired
    StatsService statsService;

    @GetMapping()
    public List<StatParMatch> getall() {
        return statsService.getalljoeur();
    }

    @PostMapping()
    public Statistique create(@RequestBody Statistique statistique) {
        return statistiqueRepository.save(statistique);
    }


}
