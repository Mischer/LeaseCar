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
public class WiewHavingCar extends AdminAction {
	
	private Map<String, String> cars = new HashMap<String, String>();
	
	public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			System.out.println("-----------------------");

			Collection<Car> carBD = Config.getDAO().readCars();
			for (Car cars : carBD) {
				this.cars.put(cars.getId()+"", cars.toString());

			}
		
		}
		return SUCCESS;
	}
	
	//output

	public Map<String, String> getCars() {
		return this.cars;
	}

	// input
	
		private String car = null;

	public void setCar(String car) {
		this.car = car;
	}

	}
