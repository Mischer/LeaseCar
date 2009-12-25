package com.epam.leasecar.actions;
import java.util.Collection;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Car;
import com.epam.leasecar.model.User;

public class AddUser extends AdminAction{
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
		if (SUCCESS.equals(result)) {
			//if (isValid(this.getName()) && isValid(this.getDescription())/* && isValid(this.getPrice() )*/) {
			
			System.out.println("-----------------------");
			
		/*	Collection<Car> carBD = Config.getDAO().readCars();
			for (Car car : carBD) {
				String n = car.getName();
				String d = car.getDescription();
				int p = car.getPrice();
				
			}*/
			User man = new User();
			man.setName(this.name);
			man.setSurname(this.surname);
			man.setPatronymic(this.patronymic);
			man.setLogin(this.login);
			man.setPassword(this.password);
			man.setRole(2);
			man.setAge(this.age);
			man.setPassportdata(this.passportdata);
			Config.getDAO().addUser(man);
			
			/*if (!(n.equals(this.getName()) && d.equals(this.getDescription())) ){
				Config.getDAO().addCar(car);				
			}
			else return "forbidden";	*/
			
			}
		

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
