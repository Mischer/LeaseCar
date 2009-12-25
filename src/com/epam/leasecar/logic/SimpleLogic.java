package com.epam.leasecar.logic;

import java.util.Collection;
import com.epam.leasecar.dao.DAO;
import com.epam.leasecar.logic.Logic;
import com.epam.leasecar.model.Archive;
import com.epam.leasecar.model.Order;
import com.epam.leasecar.config.Config;


public class SimpleLogic implements Logic {
	public void addOrderToArchive(Long oid) {
		Collection<Order> order = Config.getDAO().readOrders();
		for (Order co : order) {
			if (((long) co.getId()) == ((long) oid)) {
				Archive archive = new Archive();
				co.setIstake(1);
				archive.setOrder(co);
				Config.getDAO().addArchive(archive);
				//Config.getDAO().delOrder(co);
				
			}
		}
	}
	public void addOrderToArchiveRefuse(Long oid) {
		Collection<Order> order = Config.getDAO().readOrders();
		for (Order co : order) {
			if (((long) co.getId()) == ((long) oid)) {
				Archive archive = new Archive();
				co.setIstake(2);
				archive.setOrder(co);
				Config.getDAO().addArchive(archive);
				//Config.getDAO().delOrder(co);
				
			}
		}
	}
}
