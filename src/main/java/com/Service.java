package com;

public class Service {
	
	public boolean validateEmail(String email) {
		if(email.contains("@") && email.endsWith(".com"))
			return true;
		
		else 
			return false;
	}

}
