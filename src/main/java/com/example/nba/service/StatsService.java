package com.example.nba.service;

import com.example.nba.model.Equipe;
import com.example.nba.model.Joueur;
import com.example.nba.model.StatParMatch;
import com.example.nba.model.Statistique;
import com.example.nba.repository.EquipeRepository;
import com.example.nba.repository.JoueurRepository;
import com.example.nba.repository.MatchRepository;
import com.example.nba.repository.StatistiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatsService {
    @Autowired
    StatistiqueRepository statistiqueRepository;

    @Autowired
    JoueurRepository joueurRepository;

    @Autowired
    EquipeRepository equipeRepository;
    @Autowired
    MatchRepository matchRepository;

    public List<StatParMatch> getalljoeur() {
        List<StatParMatch> valiny = new ArrayList<StatParMatch>();
        List<Joueur> listjoueur = joueurRepository.findAll();

        for(Joueur j : listjoueur) {
            valiny.add(this.parJoueur(j.getIdjoueur()));
        }

        return valiny;
    }

    public StatParMatch parJoueur(Integer idjoueur) {
        Joueur j = joueurRepository.findById(idjoueur).get();
        Equipe e = equipeRepository.findById(j.getIdequipe()).get();
        Integer mequipe = matchRepository.countMatchequipe(j.getIdequipe());
        Integer mjoueur = this.getMatchJoueur(idjoueur);
        Double ppm = this.ppm(idjoueur);
        Double rpm = this.rpm(idjoueur);
        Double pdpm = this.pdpm(idjoueur);
        Double FG = this.FG(idjoueur);
        Double pourc3ps = this.pourc3pts(idjoueur);

        StatParMatch valiny = new StatParMatch();
        valiny.setJoueur(j);
        valiny.setEquipe(e);
        valiny.setMatchequipe(mequipe);
        valiny.setMatchjoueur(mjoueur);
        valiny.setPpm(ppm);
        valiny.setRpm(rpm);
        valiny.setPdpm(pdpm);
        valiny.setFG(FG);
        valiny.setPourc3(pourc3ps);

        return valiny;
    }

    public Integer getMatchJoueur(Integer idjoueur) {
        Integer valiny = statistiqueRepository.getmatchjoueur(idjoueur);

        return valiny;
    }

    public Double ppm(Integer idjoueur) {
        Double pointstotal = this.pointstotalJoueur(idjoueur);
        Integer matchjouer = this.getMatchJoueur(idjoueur);

        return pointstotal/matchjouer;
    }
    public Double pointstotalJoueur(Integer idjoueur) {
        List<Statistique> liststat = statistiqueRepository.getstatbyjoueur(idjoueur);
        Double sum3pts = 0.0;
        Double sum2pts = 0.0;

        for(Statistique s : liststat) {
            sum3pts += s.getP3marque() * 3;
            sum2pts += s.getP2marque() * 2;
        }

        return  sum2pts+sum3pts;
    }

    public Double rpm(Integer idjoueur) {
        Double total = this.totalrebond(idjoueur);
        Integer mjouer = this.getMatchJoueur(idjoueur);

        Double valiny = total/mjouer;

        return  valiny;
    }

    public Double totalrebond(Integer idjoueur) {
        List<Statistique> liststat = statistiqueRepository.getstatbyjoueur(idjoueur);
        Double sumreboff = 0.0;
        Double sumrebdeff = 0.0;

        for(Statistique s : liststat) {
            sumreboff += s.getRboff();
            sumrebdeff += s.getRbdeff();
        }

        return sumreboff + sumrebdeff;
    }

    public Double pdpm(Integer idjoueur) {
        Double total = this.totalpasse(idjoueur);
        Integer match = this.getMatchJoueur(idjoueur);

        return total/match;
    }
    public Double totalpasse(Integer idjoueur) {
        List<Statistique> liststat = statistiqueRepository.getstatbyjoueur(idjoueur);
        Double valiny = 0.0;
        for (Statistique s : liststat) {
            valiny += s.getPassedes();
        }

        return valiny;
    }

    public Double FG(Integer idjoueur) {
        List<Statistique> liststat = statistiqueRepository.getstatbyjoueur(idjoueur);
        Double marque = 0.0;
        Double tire = 0.0;

        for(Statistique s : liststat) {
            marque += (s.getP2marque() + s.getP3marque());
            tire += (s.getP2tire() + s.getP3tire());
        }

        Double valiny = (marque * 100) / tire;

        return valiny;
    }

    public Double pourc3pts(Integer idjoueur) {
        List<Statistique> liststat = statistiqueRepository.getstatbyjoueur(idjoueur);
        Double marque = 0.0;
        Double tire = 0.0;

        for(Statistique s : liststat) {
            marque += s.getP3marque();
            tire += s.getP3tire();
        }

        Double valiny = (marque * 100) / tire;

        return valiny;
    }
}
