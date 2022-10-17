package com.Open_MRS.utility;

import java.util.LinkedList;
import java.util.List;

public class Constants {

	public final String Login = "login";
	
	public final String ClickButton = "clickButton";
	
	public final String Logout = "logout";
	
	List<String> lstOfTagElement = new LinkedList<String>() {{
		add(Login);
		add(ClickButton);
		add(Logout);
	}};
}
