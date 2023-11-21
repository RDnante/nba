package com.example.nba.controller;

import com.example.nba.model.Match;
import com.example.nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    MatchRepository matchRepository;
    @GetMapping()
    public List<Match> getmatch() {
        return matchRepository.findAll();
    }

    @PostMapping()
    public Match createMatch(@RequestBody Match match) {
        return matchRepository.save(match);
    }
}
