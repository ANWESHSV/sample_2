package com.dsce;

import java.util.ResourceBundle;

public class App {
	public int userLogin(String in_user, String in_password) {
		ResourceBundle rd=ResourceBundle.getBundle("config");
		String username=rd.getString("username");
		String password=rd.getString("password");
		if(in_user.equals(username) && in_password.equals(password))
			return 1;
		else
			return 0;
	}

}
