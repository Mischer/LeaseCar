package com.epam.leasecar.actions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Order;
import com.epam.leasecar.dao.DAO;
import com.epam.leasecar.dao.HibernateDAO;

@SuppressWarnings("serial")
public class ViewOrder extends AdminAction {
	/*(Long.parseLong("2")*/
	//private String oid;
	//private Collection<Order> ord = Config.getDAO().readOrderOnId(Long.parseLong("1"));
	private Collection<Order> ord = Config.getDAO().readNewOrders();
	
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			System.out.println("-----------------------");
			
		}
		return SUCCESS;
	}

	public Collection<Order> getOrd() {
		return ord;
	}

	public void setOrd(Collection<Order> ord) {
		this.ord = ord;
	}
	

	
	
	

	
	}
