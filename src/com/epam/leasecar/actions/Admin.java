package com.epam.leasecar.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Admin extends ActionSupport {

	private String message;

public String execute() throws Exception {
		
		String result = super.execute();
		if (SUCCESS.equals(result)) {
//			if (!"student".equals(ActionContext.getContext().getSession().get("loginType"))) {
//				return "forbidden";
//			}
//			else {
				this.setMessage("Hello, Admin \"" + ActionContext.getContext().getSession().get("username") + "\"");
//			}
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