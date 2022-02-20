package com.capgemini.academy.teste02;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio2 {
	static String PASSWORD_PATTERN ="(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*])(?=.*[0-9]).{6,}$";
	static Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

	public boolean isValid(final String password) {
		
		if(password != null) {
		Matcher matcher = pattern.matcher(password);
		matcher.matches();
		return true;
		}
		return false;
		
	}

}
