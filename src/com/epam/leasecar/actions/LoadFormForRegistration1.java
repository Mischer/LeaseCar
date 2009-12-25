package com.epam.leasecar.actions;

import com.epam.leasecar.config.Config;

import com.epam.leasecar.model.User;

public class LoadFormForRegistration1 extends AdminAction{
	protected String surname;
	protected String name;
	protected String patronymic;
	protected String login;
	protected String password;
	protected int role;
	protected int age;
	protected String passportdata;
	
	public String execute() throws Exception {
		String result = super.execute();
		
			return SUCCESS;
		}
	
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
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
	
	
}
