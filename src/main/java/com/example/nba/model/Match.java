package com.example.nba.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idmatch;

    @Column(name = "equipea")
    Integer equipea;

    @Column(name = "equipeb")
    Integer equipeb;

    @Column(name = "date")
    Date date;

    public Match() {
    }

    public Integer getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(Integer idmatch) {
        this.idmatch = idmatch;
    }

    public Integer getEquipea() {
        return equipea;
    }

    public void setEquipea(Integer equipea) {
        this.equipea = equipea;
    }

    public Integer getEquipeb() {
        return equipeb;
    }

    public void setEquipeb(Integer equipeb) {
        this.equipeb = equipeb;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
