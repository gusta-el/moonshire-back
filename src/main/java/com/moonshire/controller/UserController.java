package com.moonshire.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonshire.dto.UserDTO;
import com.moonshire.entity.Player;
import com.moonshire.repository.PlayerRepository;

@RestController
public class UserController {

	@Autowired
	PlayerRepository repository;
	
	
	@PostMapping(value = "/login")
	public Boolean login(@RequestBody UserDTO userDto) {
		
		Player player = repository.findByPlayerEmail(userDto.getPlayerEmail());
		
		if(Objects.nonNull(player)) {
			if(player.getPlayerPassword().equals(userDto.getPlayerPassword()))
				return true;
		}
		
		return false;
		
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
	
	
}
