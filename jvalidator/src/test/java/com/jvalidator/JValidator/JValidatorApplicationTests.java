package com.jvalidator.JValidator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jvalidator.services.JValidator;

@SpringBootTest
class JValidatorApplicationTests {
		
	private JValidator validator = new JValidator();
	
	@Test
	void isNumeric() {
		assertTrue(validator.isNumeric("4"));
	}
	
	/*@Test
	void isInteger() {
<<<<<<< HEAD
		assertTrue(validator.isInteger("1"));
	}
	
	@Test
	void isNullorEmpty() {
		assertTrue(validator.isNullorEmpty(null));
	}
	
	@Test
	void isLetters() {
		assertTrue(validator.isLetters("aefjfigi"));
	}
	
	@Test
	void isUpperCase() {
		assertTrue(validator.isUpperCase("AEFJFIGI"));
	}
	
	@Test
	void isLowerCase() {
		assertTrue(validator.isLowerCase("aefjfigi"));
	}
	
	@Test
	void isUpperCaseAll() {
		assertTrue(validator.isUpperCaseAll("AEFJFIGI"));
	}
	
	@Test
	void isLowerCaseAll() {
		assertTrue(validator.isLowerCaseAll("aefjfigi"));
	}
=======
		JValidator validator = new JValidator();
		assertTrue(validator.isInteger("j"));
	}*/
>>>>>>> 47d73e2020c21b44ae04676c1e21bdfdadcc861f

}
