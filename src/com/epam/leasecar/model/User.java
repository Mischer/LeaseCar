package com.epam.leasecar.model;

public class User extends Man{
	
	protected int age = 18;
	protected String passportdata ="";
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassportdata() {
		return passportdata;
	}
	public void setPassportdata(String passportdata) {
		this.passportdata = passportdata;
	}
	Integer h = new Integer(age);
	public String toString(){
		return (this.name + ":_:" + this.surname +":_:" + this.login +":_:"+ this.password +":_:"+ h.toString());
	}
	
}
