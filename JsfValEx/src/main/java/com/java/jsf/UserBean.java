package com.java.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UserBean {
	
	
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private boolean emailExists(String email) {
		return "sulu@gmail.com".equalsIgnoreCase(email);
	}
	public String register() {
		FacesContext context= FacesContext.getCurrentInstance();
		if(emailExists(email)) {
			
			context.addMessage("email", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Email already registred", "choose a different email"));
			context.validationFailed();
			return null;
		}
		
	  context.addMessage(null, new FacesMessage("","Email Regsitration Syuccesssful"));
	  return null;
	}

}
