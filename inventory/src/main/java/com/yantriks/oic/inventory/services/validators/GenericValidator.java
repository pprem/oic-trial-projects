package com.yantriks.oic.inventory.services.validators;

import static org.hamcrest.CoreMatchers.instanceOf;

public class GenericValidator implements Validator {

	public ValidateResponse validate(Object object) {
		// TODO Auto-generated method stub
		if(!(object instanceof String)){
			return new ValidateResponse(ValidationStatus.DATA_WRITE_FAILED,"Failed done!!");
		}
		return new ValidateResponse(ValidationStatus.DATA_WRITE_SUCCESS,"successfully done!!");
	}

}
