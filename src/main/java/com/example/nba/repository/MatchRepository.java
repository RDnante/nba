package com.example.nba.repository;

import com.example.nba.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MatchRepository extends JpaRepository<Match,Integer> {
    @Query("select count(s.idmatch) from Match s where s.equipea = ?1 or s.equipeb = ?1")
    public Integer countMatchequipe(Integer idequipe);
}
