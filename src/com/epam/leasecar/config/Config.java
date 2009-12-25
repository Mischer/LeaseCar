package com.epam.leasecar.config;

import com.epam.leasecar.logic.Logic;
import com.epam.leasecar.logic.SimpleLogic;
import com.epam.leasecar.dao.DAO;
import com.epam.leasecar.dao.HibernateDAO;

public class Config {
	
	protected static DAO dao = null;
	protected static Logic logic = null;
	
	public static DAO getDAO() {
		if (dao == null) {
			dao = new HibernateDAO();
		}
		return dao;
	}
	
	
	public static Logic getLogic() {
		if (logic == null) {
			logic = new SimpleLogic();
		}
		return logic;
	}

}