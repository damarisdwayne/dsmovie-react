package com.dev.DsMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.DsMovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
