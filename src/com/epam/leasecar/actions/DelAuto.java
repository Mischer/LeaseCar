package com.epam.leasecar.actions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Car;
import com.epam.leasecar.dao.DAO;
import com.epam.leasecar.dao.HibernateDAO;
@SuppressWarnings("serial")
public class DelAuto extends AdminAction{
	
	private String car;
	
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
	
		System.out.println("-----------------------");
		Collection<Car> carBD = Config.getDAO().readCars();
			for (Car car1 : carBD) {
			//if ( !car1.isHavingg() c) { 
			if ( car1.getId() == Integer.parseInt(car)) {
			Config.getDAO().delCar(car1);
				} 
			}
			
			return SUCCESS;
		}
		else return "forbidden";
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
}
