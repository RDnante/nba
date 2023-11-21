package com.example.nba.model;

import javax.persistence.*;

@Entity
@Table(name = "statistique")
public class Statistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idstatistique;

    @Column(name = "idmatch")
    Integer idmatch;

    @Column(name = "idjoueur")
    Integer idjoueur;

    @Column(name = "p3tire")
    Integer p3tire;

    @Column(name = "p3marque")
    Integer p3marque;

    @Column(name = "p2tire")
    Integer p2tire;

    @Column(name = "p2marque")
    Integer p2marque;

    @Column(name = "rboff")
    Integer rboff;

    @Column(name = "rbdeff")
    Integer rbdeff;

    @Column(name = "passedes")
    Integer passedes;


    public Statistique() {
    }

    public Integer getPassedes() {
        return passedes;
    }

    public void setPassedes(Integer passedes) {
        this.passedes = passedes;
    }

    public Integer getIdstatistique() {
        return idstatistique;
    }

    public void setIdstatistique(Integer idstatistique) {
        this.idstatistique = idstatistique;
    }

    public Integer getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(Integer idmatch) {
        this.idmatch = idmatch;
    }

    public Integer getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(Integer idjoueur) {
        this.idjoueur = idjoueur;
    }

    public Integer getP3tire() {
        return p3tire;
    }

    public void setP3tire(Integer p3tire) {
        this.p3tire = p3tire;
    }

    public Integer getP3marque() {
        return p3marque;
    }

    public void setP3marque(Integer p3marque) {
        this.p3marque = p3marque;
    }

    public Integer getP2tire() {
        return p2tire;
    }

    public void setP2tire(Integer p2tire) {
        this.p2tire = p2tire;
    }

    public Integer getP2marque() {
        return p2marque;
    }

    public void setP2marque(Integer p2marque) {
        this.p2marque = p2marque;
    }

    public Integer getRboff() {
        return rboff;
    }

    public void setRboff(Integer rboff) {
        this.rboff = rboff;
    }

    public Integer getRbdeff() {
        return rbdeff;
    }

    public void setRbdeff(Integer rbdeff) {
        this.rbdeff = rbdeff;
    }
}
