package com.example.nba.model;

public class StatParMatch {
    Joueur joueur;

    Equipe equipe;

    Integer matchequipe;

    Integer matchjoueur;

    Double ppm;

    Double rpm;

    Double pdpm;

    Double FG;

    Double pourc3;

    public StatParMatch() {
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Integer getMatchequipe() {
        return matchequipe;
    }

    public void setMatchequipe(Integer matchequipe) {
        this.matchequipe = matchequipe;
    }

    public Integer getMatchjoueur() {
        return matchjoueur;
    }

    public void setMatchjoueur(Integer matchjoueur) {
        this.matchjoueur = matchjoueur;
    }

    public Double getPpm() {
        return ppm;
    }

    public void setPpm(Double ppm) {
        this.ppm = ppm;
    }

    public Double getRpm() {
        return rpm;
    }

    public void setRpm(Double rpm) {
        this.rpm = rpm;
    }

    public Double getPdpm() {
        return pdpm;
    }

    public void setPdpm(Double pdpm) {
        this.pdpm = pdpm;
    }

    public Double getFG() {
        return FG;
    }

    public void setFG(Double FG) {
        this.FG = FG;
    }

    public Double getPourc3() {
        return pourc3;
    }

    public void setPourc3(Double pourc3) {
        this.pourc3 = pourc3;
    }
}
