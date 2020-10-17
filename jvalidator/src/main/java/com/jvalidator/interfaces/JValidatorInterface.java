package com.jvalidator.interfaces;

public interface JValidatorInterface {

	public boolean isNumeric(String value);
	public boolean isInteger(String value);
	public boolean isDecimal(String value);
	public boolean isNullorEmpty(String value);
	public boolean isLetters(String value);
	public boolean isUpperCase(String value);
	public boolean isLowerCase(String value);
	public boolean isUpperCaseAll(String value);
	public boolean isLowerCaseAll(String value);
	public boolean isAlphaBet(String value);
	public boolean isHourFormat(String value);
	public boolean isDateFormat(String value);
	public boolean isEmail(String value);
	public boolean isCPF(String value);
	public boolean isCNPJ(String value);
}
