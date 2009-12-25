package com.epam.leasecar.actions;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Order;
import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
public class OrderToArchive1 extends AdminAction {

	Set m_closed = new HashSet();
	
	public void setDemandOrder(String[] demandOrder) {
	    for (int i = 0; i < demandOrder.length; i++) {
	        m_closed.add(demandOrder[i]);
	    }
	}

	Map<Long, String> courses = new HashMap<Long, String>();
	
	public String execute() throws Exception {
		String result = super.execute();
		
		
		if (SUCCESS.equals(result)) {

			for (Object m : m_closed) {
				System.out.println("----------------------"+ m);
				Config.getLogic().addOrderToArchiveRefuse(Long.parseLong((String) (m)));
			}
			
			
		
			return SUCCESS;
		}
		else return "forbidden";
	}

	
}
