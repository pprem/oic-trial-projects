package com.yantriks.oic.inventory.services.validators;

import java.util.ArrayList;
import java.util.List;

public class AggregateValidateResponse {
	private Boolean status;
	private List<ValidateResponse> responses;
	
	public AggregateValidateResponse() {
		responses = new ArrayList<ValidateResponse>();
	}

	public List<ValidateResponse> getResponses() {
		return responses;
	}

	public void setResponses(List<ValidateResponse> responses) {
		this.responses = responses;
	}
	
	public void addResponse(ValidateResponse response) {
		responses.add(response);
	}
	
	public void removeResponse(ValidateResponse response) {
		if(!responses.contains(response)) {
			throw new IllegalArgumentException();
			}
		
		responses.remove(response);
	}
	

	


}
