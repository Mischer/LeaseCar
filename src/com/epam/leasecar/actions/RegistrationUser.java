package com.epam.leasecar.actions;
import java.util.Collection;

import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Car;
import com.epam.leasecar.model.Man;
import com.epam.leasecar.model.User;

public class RegistrationUser extends AdminAction{
	protected String surname;
	protected String name;
	protected String patronymic;
	protected String login;
	protected String password;
	protected int role;
	protected int age;
	protected String passportdata;
	
	boolean flag = false;
	
	public String execute() throws Exception {
		String result = super.execute();
    
		if (isValid(this.getLogin()) && isValid(this.getPassword())) {
        	
        	Collection<Man> mans = Config.getDAO().readMans();
        	for (Man man : mans) {
        		String ml = man.getLogin();
        		//String mp = man.getPassword();

        	if (ml.equals(this.getLogin()) /*&& mp.equals(this.getPassword())*/) {
        		flag = true;
        		return "*";
        		}
        	}	
        	if (flag == false) {
        		
			User user = new User();
			user.setName(this.name);
			user.setSurname(this.surname);
			user.setPatronymic(this.patronymic);
			user.setLogin(this.login);
			user.setPassword(this.password);
			user.setRole(2);
			user.setAge(this.age);
			user.setPassportdata(this.passportdata);
			Config.getDAO().addUser(user);
			//break;
        	//}
        		//else return "forbidden";//break ;
        	}
        }

			return SUCCESS;
		}
	
        		private boolean isValid(String value) {
        	        return (value != null && value.length() != 0);
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
