package com.moonshire.dto;

public class GameDTO {

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
	public GameDTO(Long gameId, String gameName, Integer gameYear) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameYear = gameYear;
	}

	public GameDTO() {
	}
	
    
    
}
