package com.jvalidator.services;

import com.jvalidator.interfaces.JValidatorInterface;

public class JValidator implements JValidatorInterface {

	
	@Override
	public boolean isNumeric(String value) {
		boolean result = true;
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException error) {
	        result = false;
	    }

		return result;
	}

	@Override
	public boolean isInteger(String value) {
		
		Boolean isInteger = false;
		
		for(int i = 0 ; i < value.length() ; i++) {
			
			if(Character.isDigit(value.charAt(0))) {
				if(!value.contains(","))
					isInteger = true;
			} else {
				isInteger = false;
				break;
			}	
		}
		

		return isInteger;
	}

	@Override
	public boolean isDecimal(String value) {

		
		boolean result = true;
		
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException error) {
	        result = false;
	    }
		return result;
	}

	@Override
	public boolean isNullorEmpty(String value) {
		return value == null || value.isEmpty();
	}

	@Override
	public boolean isLetters(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isLetter(value.charAt(i))) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean isUpperCase(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isUpperCase(value.charAt(i))) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean isLowerCase(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isLowerCase(value.charAt(i))) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean isUpperCaseAll(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isUpperCase(value.charAt(i))) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean isLowerCaseAll(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isLowerCase(value.charAt(i))) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean isAlphaBet(String value) {
		Boolean result = true;
		
		for(int i = 0 ; i < value.length() ; i++) {
			if(!Character.isAlphabetic(value.charAt(i))) {
				result = false;
				break;
			}
		}
		return result;
	}

	@Override
	public boolean isHourFormat(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDateFormat(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmail(String value) {
		return value.contains("@") && value.contains(".com");
	}

	@Override
	public boolean isCPF(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCNPJ(String value) {
		return value.length() == 14;
	}

	
}
