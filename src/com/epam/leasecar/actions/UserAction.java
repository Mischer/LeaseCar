package com.epam.leasecar.actions;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends User{ //ActionSupport {
	
	
	
	public String execute() throws Exception {
		if (!"user".equals(ActionContext.getContext().getSession().get("loginType"))) {
			return "forbidden";
		}
	return SUCCESS;
	}
	
}
