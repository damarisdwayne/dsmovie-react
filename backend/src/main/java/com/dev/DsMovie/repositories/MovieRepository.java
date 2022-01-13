package com.dev.DsMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.DsMovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
