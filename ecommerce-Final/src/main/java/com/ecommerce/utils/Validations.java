package com.ecommerce.utils;

public class Validations 
{
	public static boolean validateUserName(String uname) {
		if(uname != null 
				&& uname.length()>=2 && uname.length()<=20) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateEmailId(String emailid) {
		if(emailid != null 
				&& emailid.length()>=6) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateMobile(String mobile) {
		if(mobile != null 
				&& mobile.length() == 10) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean validatePassword(String password) {
		if(password != null 
				&& password.length() >= 8 && password.length() <= 16) 
		{
			return true;
		}
		return false;
	}
}
