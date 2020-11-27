package com.moonshire.dto;

public class ValidPasswordDTO {

    private Boolean validation;
    
	public ValidPasswordDTO(Boolean validation) {
		this.validation = validation;
	}

	public ValidPasswordDTO() {
	}

	public Boolean getValidation() {
		return validation;
	}

	public void setValidation(Boolean validation) {
		this.validation = validation;
	}
	
    
    
}
