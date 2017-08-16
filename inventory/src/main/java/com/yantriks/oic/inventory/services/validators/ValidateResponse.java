package com.yantriks.oic.inventory.services.validators;

public class ValidateResponse {
	private ValidationStatus status;
	private String message;
	public ValidateResponse(ValidationStatus status, String message) {
		this.message = message;
		this.status = status;
	}

}
