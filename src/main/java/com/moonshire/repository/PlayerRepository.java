package com.moonshire.repository;

import org.springframework.data.repository.CrudRepository;

import com.moonshire.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{

	Player findByPlayerEmail(String playerEmail);
	
	
}
