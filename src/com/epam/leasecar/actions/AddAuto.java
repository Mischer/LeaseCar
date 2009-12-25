package com.epam.leasecar.actions;

//import java.util.Collection;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Car;


public class AddAuto extends AdminAction{
	private String name = "";
	private String description = "";
	private int price = 0;
	private boolean havingg = false;
	
		public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			//if (isValid(this.getName()) && isValid(this.getDescription())/* && isValid(this.getPrice() )*/) {
			
			System.out.println("-----------------------");
			
		/*	Collection<Car> carBD = Config.getDAO().readCars();
			for (Car car : carBD) {
				String n = car.getName();
				String d = car.getDescription();
				int p = car.getPrice();
				
			}*/
			Car car = new Car();
			car.setName(this.name);
			car.setDescription(this.description);
			car.setPrice(this.price);
			car.setHavingg(this.havingg);
			Config.getDAO().addCar(car);
			
			/*if (!(n.equals(this.getName()) && d.equals(this.getDescription())) ){
				Config.getDAO().addCar(car);				
			}
			else return "forbidden";	*/
			
			}
		

			return SUCCESS;
		}
			
		
	/*	private boolean isValid(String value) {
	    return (value != null && value.length() != 0);
			}
	*/
		
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			
			public boolean isHavingg() {
				return havingg;
			}
			public void setHavingg(boolean havingg) {
				this.havingg = havingg;
			}
			public void setPrice(int price) {
				this.price = price;
			}


			public int getPrice() {
				return price;
			}
		
}
