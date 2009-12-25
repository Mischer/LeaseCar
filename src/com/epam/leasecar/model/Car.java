package com.epam.leasecar.model;

public class Car {
	private Long id = null;
	protected boolean havingg = false;
	protected String name = "";
	protected String description = "";//opisanie
	protected int price = 100;//cena
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString(){
		Integer g = new Integer(price);
		return (this.name + ": :" + this.description +": :" + g.toString());
	}
	public boolean isHavingg() {
		return havingg;
	}
	public void setHavingg(boolean havingg) {
		this.havingg = havingg;
	}
	

}
