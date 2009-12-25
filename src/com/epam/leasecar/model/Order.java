package com.epam.leasecar.model;

import com.epam.leasecar.model.User;
import com.epam.leasecar.model.Car;

public class Order {
	private Long id = null;
	protected String data = "";
	protected int days = 0;
	protected int istake = 0;
	protected User user = null;
	protected Car car = null;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
