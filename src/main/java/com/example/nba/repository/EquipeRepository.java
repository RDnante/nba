package com.example.nba.repository;

import com.example.nba.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
