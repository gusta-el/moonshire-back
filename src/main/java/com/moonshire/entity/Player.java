package com.moonshire.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long playerId;
   
    private String playerName;
    private String playerEmail;
    private String playerPassword;
    
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerEmail() {
		return playerEmail;
	}
	public void setPlayerEmail(String playerEmail) {
		this.playerEmail = playerEmail;
	}
	public String getPlayerPassword() {
		return playerPassword;
	}
	public void setPlayerPassword(String playerPassword) {
		this.playerPassword = playerPassword;
	}
	public Player(Long playerId, String playerName, String playerEmail, String playerPassword) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerEmail = playerEmail;
		this.playerPassword = playerPassword;
	}

	public Player() {
	}
    
    
	
}
