package com.yantriks.oic.inventory.services.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationHelper {
	
	static Map<RequestTypeEnum, List<Validator>> validatorMap =  new HashMap<RequestTypeEnum,  List<Validator>>() ;
	static {
		addValidator(RequestTypeEnum.GENERIC_REQUEST, new GenericValidator() ,new GenericValidator());

	}

	public static AggregateValidateResponse validate(RequestTypeEnum requestType, String message) {

		if(!validatorMap.containsKey(requestType)) {
			throw new IllegalArgumentException();
		}
		
		List<Validator> validatorsList  = validatorMap.get(requestType);
		AggregateValidateResponse aggrValidateResponse  = new AggregateValidateResponse();
		for(Validator v : validatorsList) {
			aggrValidateResponse.addResponse(v.validate(message));
		}
		return aggrValidateResponse;
		
		
	}

	private static void addValidator(RequestTypeEnum genericRequest, Validator... validators) {
		
		List<Validator> validatorsList = Arrays.asList(validators);
		validatorMap.put(genericRequest, validatorsList);
		
		
	}

}
