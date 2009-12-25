package com.epam.leasecar.actions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.User;
import com.epam.leasecar.dao.DA;
import com.epam.leasecar.dao.HibernateDAO;
@SuppressWarnings("serial")
public class DelUser extends AdminAction{
	
	private String user;
	
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
	
		System.out.println("-----------------------");
		Collection<User> userBD = Config.getDAO().readUsers();
			for (User user1 : userBD) {
			//if ( !car1.isHavingg() c) { 
			if ( user1.getId() == Integer.parseInt(user)) {
			Config.getDAO().delUser(user1);
				} 
			}
			
			return SUCCESS;
		}
		else return "forbidden";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
