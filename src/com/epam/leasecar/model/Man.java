package com.epam.leasecar.model;

//import com.epam.leasecar.model.Man;

public class Man {
	private Long id = null;
	protected String surname = "";
	protected String name = "";
	protected String patronymic = "";
	protected String login = "";
	protected String password = "";
	protected int role = 0;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public String toString(){
		return this.name;
	}
	public boolean equals(Object o) {
		if (o == null) return false;
		if (o == this) return true;
		if (!(o instanceof Man)) return false;
		
		Man oo = (Man) o;
		
		if (oo.getName() == null) {
			if (this.getName() == null) {
				return true;
			} else {
				return false;
			}
		}
		
		return ((Man) o).getName().equals(this.getName());
	}
}
