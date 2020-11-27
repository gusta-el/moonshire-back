package com.moonshire.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonshire.dto.GameDTO;
import com.moonshire.entity.Game;
import com.moonshire.repository.GameRepository;

@RestController
public class GameController {

	@Autowired
	private GameRepository repository;
		
	@GetMapping(value = "/games")
	public ResponseEntity<List<GameDTO>> games() {
		
		
		Game game = repository.findByGameName("Garras e Penas");
		
		List<Game> games = repository.findAll();
		
		
		Iterable<Game> gamesIt = repository.findAll();
//		
//		List<GameDTO> games = StreamSupport.stream(gamesIt.spliterator(), false)
//			.map(game -> new GameDTO(game.getGameId(), game.getGameName(), game.getGameYear()))
//			.collect(Collectors.toList());
		
		return ResponseEntity.ok(null);
		
	}
	
}
