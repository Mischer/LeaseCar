package com.epam.leasecar.model;

import java.util.ArrayList;
import java.util.Collection;

//import com.epam.leasecar.model.User;
//import com.epam.leasecar.model.Car;

public class Archive  {
	private Long id = null;
	protected Order order = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
