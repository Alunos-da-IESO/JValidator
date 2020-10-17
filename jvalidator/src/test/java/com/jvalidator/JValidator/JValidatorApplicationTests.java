package com.jvalidator.JValidator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jvalidator.services.JValidator;

@SpringBootTest
class JValidatorApplicationTests {
	
	@Test
	void isNumeric() {
		JValidator validator = new JValidator();
		assertTrue(validator.isNumeric("4"));
	}
	
	@Test
	void isInteger() {
		JValidator validator = new JValidator();
		assertTrue(validator.isInteger("1"));
	}
	
	@Test
	void isNullorEmpty() {
		JValidator validator = new JValidator();
		assertTrue(validator.isNullorEmpty(null));
	}
	
	@Test
	void isLetters() {
		JValidator validator = new JValidator();
		assertTrue(validator.isLetters("aefjfigi"));
	}

}
