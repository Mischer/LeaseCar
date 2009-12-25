package com.epam.leasecar.actions;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Logout extends ActionSupport {
    
	public String execute() throws Exception {
    	ActionContext.getContext().getSession().remove("loginType");
    	ActionContext.getContext().getSession().remove("username");
        
        return SUCCESS;
    }
}
