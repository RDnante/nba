package com.example.nba.model;

import javax.persistence.*;

@Entity
@Table(name = "composition")
public class Composition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idcomposition;

    @Column(name = "idmatch")
    Integer idmatch;

    @Column(name = "idjoueur")
    Integer idjoueur;

    public Composition() {
    }

    public Integer getIdcomposition() {
        return idcomposition;
    }

    public void setIdcomposition(Integer idcomposition) {
        this.idcomposition = idcomposition;
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
}
