package com.yantriks.oic.inventory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yantriks.oic.AppConfig;
import com.yantriks.oic.inventory.services.validators.AggregateValidateResponse;
import com.yantriks.oic.inventory.services.validators.RequestTypeEnum;
import com.yantriks.oic.inventory.services.validators.ValidateResponse;
import com.yantriks.oic.inventory.services.validators.ValidationHelper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})

public class ValidatorTests {
	@Test 
	public void testValidate() {
		ValidationHelper validator = new ValidationHelper();
		AggregateValidateResponse vr = validator.validate(RequestTypeEnum.GENERIC_REQUEST, "Testing");
	}
	
	@Test 
	public void validateWithBadRequestType() {
		ValidationHelper validator = new ValidationHelper();
		AggregateValidateResponse vr = validator.validate(RequestTypeEnum.GENERIC_REQUEST, "information");
	}

}
