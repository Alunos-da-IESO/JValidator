package com.jvalidator.interfaces;

public interface JValidatorInterface {

	public boolean isNumeric(String value);
	public boolean isInteger(String value);
	public boolean isDecimal(String value, char decimalSeparator);
	public boolean isNullorEmpty(String value);
	public boolean isLetters(String value);
	public boolean isUpperCase(String value);
	public boolean isLowerCase(String value);
	public boolean isUpperCaseAll(String value);
	public boolean isLowerCaseAll(String value);
	public boolean isIntegerInRange(int value, int lowerBound, int upperBound);
	public boolean isDecimalInRange(double value, double lowerBound, double upperBound);
	public boolean isAlphaBet(String value);
	public boolean isLetterInRange(char value, char lowerBound, char upperBound);
	public boolean isHourFormat(String value, String format);
	public boolean isDateFormat(String value, String format);
	public boolean isEmail(String value);
	public boolean isCPF(String value);
	public boolean isCNPJ(String value);
}
