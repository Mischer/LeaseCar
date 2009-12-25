package com.epam.leasecar.actions;

import java.util.Collection;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Car;


public class LoadFormForAddAuto extends AdminAction{
	private String name;
	private String description;
	private int price;
	private boolean havingg;
	
		public String execute() throws Exception {
		String result = super.execute();
		if (SUCCESS.equals(result)) {
			//if (isValid(this.getName()) && isValid(this.getDescription())/* && isValid(this.getPrice() )*/) {
			
			System.out.println("-----------------------");
			
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
