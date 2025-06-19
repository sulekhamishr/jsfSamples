package com.java.jsf;

public class LoginDao {
	
	public String validateDao(String userName, String pwd)
	{
		if(userName.equals("infinite") && pwd.equals("infinite")) {
			
		return "Menu.jsp?faces-redirect=true";
		}
		else {
			return "Login.jsp?faces-redirect=true";
		}
		
	}
	

}
//JSF (JavaServer Faces): A framework for building web applications in Java. It uses server-side components like JSP (JavaServer Pages) and managed beans to handle user requests.

//faces-redirect=true: This is a parameter in JSF used to indicate that the response should be a redirect. This is part of the navigation system in JSF.

//The faces-redirect=true part ensures that the redirect is handled by the JSF lifecycle, meaning that the server sends a redirect response to the client's browser.

