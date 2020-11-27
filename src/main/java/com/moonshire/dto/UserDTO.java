package com.moonshire.dto;

public class UserDTO {

	private String playerName;
	private String playerEmail;
	private String playerPassword;
	
	public UserDTO() {
	}
	
	

	public UserDTO(String playerName, String playerEmail, String playerPassword) {
		super();
		this.playerName = playerName;
		this.playerEmail = playerEmail;
		this.playerPassword = playerPassword;
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
	
	
	
	
}
