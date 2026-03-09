package com.problem_question1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidatorTest {
	

	
	    Validator validator = new Validator();

	    @Test
	    public void validateNameValidTest() {
	        assertTrue(validator.validateName("Sam Johnson"));
	    }

	    @Test
	    public void validateNameInvalidTest() {
	        assertFalse(validator.validateName("Maria"));
	    }

	    @Test
	    public void validateAgeValidTest() {
	        assertTrue(validator.validateAge(18));
	    }

	    @Test
	    public void validateAgeInvalidTest() {
	        assertFalse(validator.validateAge(17));
	    
	}


}
