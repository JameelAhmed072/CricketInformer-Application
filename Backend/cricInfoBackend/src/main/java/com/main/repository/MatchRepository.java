package com.main.repository;

import com.main.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);
}
