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
	
	@Test
	void isInteger() {
		assertTrue(validator.isInteger("1"));
	}
	
	@Test
	void isDecimal() {
		assertTrue(validator.isDecimal("5.5"));
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

	@Test
	void isAlphaBet() {
		assertTrue(validator.isAlphaBet("aefjfigi"));
	}

	@Test
	void isEmail() {
		assertTrue(validator.isEmail("teste@hotmail.com"));
	}
	
	@Test
	void isCPF() {
		assertTrue(validator.isCPF("11270099400"));
	}
	
	@Test
	void isCNPJ() {
		assertTrue(validator.isCNPJ("30632330000160"));
	}
	
	@Test
	void isHourFormat() {
		assertTrue(validator.isHourFormat("20:43:55"));
	}
	
	@Test
	void isDateFormat() {
		assertTrue(validator.isDateFormat("04/11/2000"));
	}

}
