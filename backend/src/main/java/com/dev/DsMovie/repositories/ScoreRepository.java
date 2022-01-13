package com.dev.DsMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.DsMovie.entities.Score;
import com.dev.DsMovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
