package com.yantriks.oic.inventory.services.validators;

public enum ValidationStatus {
	DATA_WRITE_SUCCESS("Data Write Successful",212),
	DATA_WRITE_FAILED("Data Write Failed",512);
	private String statusMsg;
	private int statusCode;
	ValidationStatus(String statusMsg, int statusCode){
		this.statusMsg = statusMsg;
		this.statusCode = statusCode;
	}
	

}
