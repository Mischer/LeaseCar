package com.epam.leasecar.actions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.User;
import com.epam.leasecar.dao.DAO;
import com.epam.leasecar.dao.HibernateDAO;

@SuppressWarnings("serial")
public class ViewUser extends AdminAction {
	
	private Map<String, String> users = new HashMap<String, String>();
	
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			System.out.println("-----------------------");
//			if (this.car != null && this.car != "") {
//			Car car = Config.getDAO().getCar(this.car);
//			Config.getDAO().readCars();
		
		
			Collection<User> userBD = Config.getDAO().readUsers();
			for (User users : userBD) {
				this.users.put(users.getId() + "", users.toString());
//			}
		
		}
		
		}
		return SUCCESS;
	}
	
	// output
	
	
	

	public Map<String, String> getUsers() {
		return this.users;
	}

	// input
	
		private String user = null;

	public void setUser(String user) {
		this.user = user;
	}

	}
