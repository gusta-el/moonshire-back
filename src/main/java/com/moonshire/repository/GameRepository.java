package com.moonshire.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moonshire.entity.Game;

public interface GameRepository extends CrudRepository<Game, Long>{

	
	Game findByGameName(String gameName);
	
	List<Game> findAll();
	
	
}
