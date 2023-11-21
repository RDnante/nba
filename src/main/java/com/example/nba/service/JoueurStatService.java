package com.example.nba.service;

import com.example.nba.model.Statistique;
import com.example.nba.repository.JoueurRepository;
import com.example.nba.repository.StatistiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurStatService {
    @Autowired
    private JoueurRepository joueurRepository;
    @Autowired
    private StatistiqueRepository statistiqueRepository;

    public void tire3points(Integer idjoueur, Integer idmatch, Integer tire) {
        Statistique statistique = statistiqueRepository.getstat(idjoueur,idmatch);
        System.out.println(statistique.getIdstatistique());
        statistique.setP3tire(tire);

        statistiqueRepository.save(statistique);
    }
    public void marquer3points(Integer idjoueur,Integer idmatch, Integer marquer) {
        Statistique statistique = statistiqueRepository.getstat(idjoueur,idmatch);

        statistique.setP3marque(marquer);
        this.tire3points(idjoueur,idmatch, marquer);
    }



}
