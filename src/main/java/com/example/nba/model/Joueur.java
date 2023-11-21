package com.example.nba.model;

import javax.persistence.*;

@Entity
@Table(name = "joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idjoueur;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @Column(name = "idequipe")
    Integer idequipe;

    public Joueur() {

    }

    public Integer getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(Integer idjoueur) {
        this.idjoueur = idjoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Integer idequipe) {
        this.idequipe = idequipe;
    }
}
