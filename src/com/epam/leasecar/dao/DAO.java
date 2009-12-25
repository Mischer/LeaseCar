package com.epam.leasecar.dao;

import java.util.Collection;



import com.epam.leasecar.model.Man;
import com.epam.leasecar.model.User;
import com.epam.leasecar.model.Admin;
import com.epam.leasecar.model.Car;
import com.epam.leasecar.model.Order;
import com.epam.leasecar.model.Archive;
public interface DAO {	
	//void createBD();
	public void addMan(Man man);
	public void addUser(User user);
	public void addAdmin(Admin admin);
	public void addCar(Car car);
	public void addOrder(Order order);
	public void addArchive(Archive archive);
	
	
	public Car getCar(Long id);
	//public Car getCarOnId(Long id);
	public void updateCar(Car car);
	public void delCar(Car car);
	public void delOrder(Order order);
	public void delUser(User user);
	
	public Collection<Order> readOrderOnId(Long oid);
	public Collection<Car> readCarOnId(Long cid);
	
	public Collection<Man> readMans();
	public Collection<Car> readCars();
	public Collection<User> readUsers();
	public Collection<String> readLoginFromUsers();
	public Collection<Admin> readAdmins();
	public Collection<Order> readOrders();
	public Collection<Order> readNewOrders();
	public Collection<Order> readRefuseOrders();
	public Collection<Order> readConfirmOrders();
}
