package com.example.nba.controller;

import com.example.nba.model.Equipe;
import com.example.nba.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private EquipeRepository equipeRepository;

    @GetMapping()
    public List<Equipe> getequipe() {
        return equipeRepository.findAll();
    }

    @PostMapping()
    public Equipe createEquipe(@RequestBody Equipe e){
        return equipeRepository.save(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        equipeRepository.deleteById(id);
    }

}
