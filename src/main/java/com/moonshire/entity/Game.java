package com.moonshire.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "GAME")
public class Game {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long gameId;
   
    private String gameName;
    private Integer gameYear;
    
	public Long getGameId() {
		return gameId;
	}
	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Integer getGameYear() {
		return gameYear;
	}
	public void setGameYear(Integer gameYear) {
		this.gameYear = gameYear;
	}
	public Game() {
	}
	public Game(Long gameId, String gameName, Integer gameYear) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameYear = gameYear;
	}
    
    
    
}
