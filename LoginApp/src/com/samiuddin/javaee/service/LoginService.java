package com.samiuddin.javaee.service;

import java.util.HashMap;

import com.samiuddin.javaee.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap();
	
	public LoginService() {
		//actual method uses Db
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("sallysm", "Sally Soccer Mom");		
	}
	
	public boolean authenticate(String userid, String password) {
		
		if (password.equalsIgnoreCase("hello") ) {
			return true;
		}
		return false;
	}

	public User getUserDetails(String userID) { // this is Model in MVC
		User user = new User();
		user.setUserName(users.get(userID));
		user.setUserID(userID);
		return user ;
	}
}
