package com.example.nba.controller;

import com.example.nba.model.Joueur;
import com.example.nba.repository.JoueurRepository;
import com.example.nba.service.JoueurStatService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/joueur")
public class JoueurController {
    @Autowired
    JoueurRepository joueurRepository;
    @Autowired
    JoueurStatService joueurStatService;

    @GetMapping()
    public List<Joueur> getjoueurs() {
        return joueurRepository.findAll();
    }

    @PostMapping()
    public Joueur createEquipe(@RequestBody Joueur joueur) {
        return joueurRepository.save(joueur);
    }

    @PostMapping("/3points")
    public Integer points(@RequestParam("idjoueur") String idjoueur, @RequestParam("idmatch") String idmatch, @RequestParam("tire") String tire) {
        Integer idj = Integer.valueOf(idjoueur);
        Integer idm = Integer.valueOf(idmatch);
        Integer t = Integer.valueOf(tire);

        joueurStatService.tire3points(idj,idm,t);

        return t;
    }


}
