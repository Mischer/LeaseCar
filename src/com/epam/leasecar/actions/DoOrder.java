package com.epam.leasecar.actions;

import java.util.Collection;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Man;
import com.epam.leasecar.model.Order;
import com.epam.leasecar.model.User;
import com.epam.leasecar.model.Car;
import com.opensymphony.xwork2.ActionContext;

public class DoOrder extends UserAction{
	private String data = "";
	private int days = 0;
	private int istake = 0;
	private String car = "";
	private User user = null;
	
	Car tempcar  = new Car();
	
		public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			if(!(days ==0)){
			if (! car.equals("")) {
				tempcar	=Config.getDAO().getCar(Long.parseLong(car) );
			}
			if (ActionContext.getContext().getSession().get("userId") != null) {
	    		long id = (Long)(ActionContext.getContext().getSession().get("userId"));
	    	
			Collection<Man> mans = Config.getDAO().readMans();
        	for (Man man : mans) {
        		//long mi = man.getId();
        		if (man.getId() == id) { 
        		
        		
			
        	
			
        		System.out.println("----Add new Order----");
			
			Order order = new Order();
			order.setData(this.data);
			order.setDays(this.days);
			order.setIstake(this.istake);
			order.setCar(tempcar);
			order.setUser((User)man);
			Config.getDAO().addOrder(order);
				
        			}
        		}
			}
		}
		}
		return SUCCESS;
		
		}
		public String getData() {
			return data;
		}


		public void setData(String data) {
			this.data = data;
		}

		public User getUser() {
			return user;
		}


		public void setUser(User user) {
			this.user = user;
		}
		
		public Car getTempcar() {
			return tempcar;
		}
		public void setTempcar(Car tempcar) {
			this.tempcar = tempcar;
		}
		public String getCar() {
			return car;
		}
		public void setCar(String car) {
			this.car = car;
		}
		public int getDays() {
			return days;
		}
		public void setDays(int days) {
			this.days = days;
		}
		public int getIstake() {
			return istake;
		}
		public void setIstake(int istake) {
			this.istake = istake;
		}
		
		
}
