package com.epam.leasecar.actions;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends Admin {//ActionSupport {
	
	protected String userNameMessage;
	
	public String execute() throws Exception {
	if (!"admin".equals(ActionContext.getContext().getSession().get("loginType"))) {
		return "forbidden";
	}
return SUCCESS;
}
	public void serUserNameMessage(String userNameMessage) {
		this.userNameMessage = userNameMessage;
	}
}
