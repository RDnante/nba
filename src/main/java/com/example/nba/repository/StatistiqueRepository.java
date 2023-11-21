package com.example.nba.repository;

import com.example.nba.model.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatistiqueRepository extends JpaRepository<Statistique,Integer> {

    @Query("from Statistique  where idjoueur = ?1 and idmatch = ?2")
    public Statistique getstat(Integer idjoueur, Integer idmatch);

    @Query("from Statistique  where idjoueur = ?1")
    public List<Statistique> getstatbyjoueur(Integer idjoueur);

    @Query("select count(s.idjoueur) from Statistique  s where s.idjoueur = ?1")
    public Integer getmatchjoueur(Integer idmatch);
}
