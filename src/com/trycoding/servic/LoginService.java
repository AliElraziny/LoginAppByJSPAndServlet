package com.trycoding.servic;

import java.util.HashMap;

import com.trycoding.dto.User;

public class LoginService {
	
	
	HashMap<String, String> users =new HashMap<String , String>();
	
	public LoginService() {
		users.put("Mohamed", "Mohamed ALi");
		users.put("Ahmed", "Ahmed Sameh");
		users.put("Samy", "Samy ALi");
	}
	
	public boolean authenticate(String userId , String pass) {
		
		
		if(pass==null || pass.trim()=="")
			return false ;
		else 
			return true;
	}
	
	public User getUserDetails(String userId) {
		
		User user =new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		
		return user ;
		
		
	}

}
