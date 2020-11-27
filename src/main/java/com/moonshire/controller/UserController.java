package com.moonshire.controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonshire.dto.UserDTO;
import com.moonshire.dto.ValidPasswordDTO;
import com.moonshire.entity.Player;
import com.moonshire.repository.PlayerRepository;

@RestController
public class UserController {

	@Autowired
	PlayerRepository repository;
		
	@PostMapping(value = "/login")
	public ResponseEntity<ValidPasswordDTO> login(@RequestBody UserDTO userDto) {
		
		Player player = repository.findByPlayerEmail(userDto.getPlayerEmail());
		
		ValidPasswordDTO validPass = new ValidPasswordDTO();
				
		if(Objects.nonNull(player)) {
			validPass.setValidation(player.getPlayerPassword().equals(userDto.getPlayerPassword()));		
		} else {
			validPass.setValidation(false);
		}
		
		return ResponseEntity.ok(validPass);
		
	}
	
	@PostMapping(value = "/user")
	public ResponseEntity<UserDTO> execute(@RequestBody UserDTO userDto) {
		
		Player player = new Player();
		player.setPlayerEmail(userDto.getPlayerEmail());
		player.setPlayerName(userDto.getPlayerName());
		player.setPlayerPassword(userDto.getPlayerPassword());
		
		
		player = repository.save(player);
				
		return ResponseEntity.ok(userDto);
		
	}
	
	@GetMapping(value = "/players")
	public ResponseEntity<List<UserDTO>> games() {
		
		Iterable<Player> playersIt = repository.findAll();
		
		List<UserDTO> players = StreamSupport.stream(playersIt.spliterator(), false)
			.map(player -> new UserDTO(player.getPlayerName(), player.getPlayerEmail(), player.getPlayerPassword()))
			.collect(Collectors.toList());
		
		return ResponseEntity.ok(players);
		
	}
	
	
}
