package com.epam.leasecar.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class User extends ActionSupport {
	
	private String message;
	   
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
//		if (!"teacher".equals(ActionContext.getContext().getSession().get("loginType"))) {
//    		return "forbidden";
//    	}
    	
    	this.setMessage("Hello, teacher \"" + ActionContext.getContext().getSession().get("username") + "\"");
		}
    	return SUCCESS;
    }

    public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}