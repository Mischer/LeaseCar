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
public class ViewCarListForUser extends UserAction {
	/*(Long.parseLong("2")*/
	//private String oid;
	//private Collection<Car> crd;// = Config.getDAO().readCarOnId(Long.parseLong("5"));
	
private Collection<Car> carlist;
	
	public String execute(){
		this.setCarlist(Config.getDAO().readCars());
		return SUCCESS;
	}
	
	public Collection<Car> getCarlist() {
		return carlist;
	}
	public void setCarlist(Collection<Car> carlist) {
		this.carlist = carlist;
	}

}

	/*public Collection<Car> getCrd() {
		return crd;
	}

	public void setCrd(Collection<Car> crd) {
		this.crd = crd;
	}
	
	}*/

