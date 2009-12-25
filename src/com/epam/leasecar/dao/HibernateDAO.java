package com.epam.leasecar.dao;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.epam.leasecar.model.Man;
import com.epam.leasecar.model.User;
import com.epam.leasecar.model.Admin;
import com.epam.leasecar.model.Car;
import com.epam.leasecar.model.Order;
import com.epam.leasecar.model.Archive;
import org.hibernate.Query;

public class HibernateDAO implements DAO {
	private static Logger logger = Logger.getLogger(HibernateDAO.class.getName());

	protected SessionFactory sessionFactory = null;
	protected Session session = null;

	private Session getSession() {
		if (this.session == null) {
			if (this.sessionFactory != null) {
				this.session = this.sessionFactory.openSession();
			}
		}
		return this.session;
	}

    public HibernateDAO() {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
        	logger.error("Hibernate session factory creation failed", e);
        }
    }
	@Override
	
	/*public void createBD()
	{
		getSession().beginTransaction();
		getSession().getTransaction().commit();	
	}*/
	public void addMan(Man man) {
		getSession().beginTransaction();
		getSession().save(man);
		getSession().getTransaction().commit();
	}
	public void addUser(User user) {
		getSession().beginTransaction();
		getSession().save(user);
		getSession().getTransaction().commit();
	}
	public void addAdmin(Admin admin) {
		getSession().beginTransaction();
		getSession().save(admin);
		getSession().getTransaction().commit();
	}
	public void addCar(Car car) {
		getSession().beginTransaction();
		getSession().save(car);
		getSession().getTransaction().commit();
	}
	public void addOrder(Order order) {
		getSession().beginTransaction();
		getSession().save(order);
		getSession().getTransaction().commit();
	}
	public void addArchive(Archive archive) {
		getSession().beginTransaction();
		getSession().save(archive);
		getSession().getTransaction().commit();
	}
	public Collection<Man> readMans() {
		getSession().beginTransaction();
		Collection<Man> result = getSession().createQuery("FROM Man").list();
		System.out.println("<------------->");
		getSession().getTransaction().commit();
		return result;
	}
	public Collection<Car> readCars() {
		getSession().beginTransaction();
		Collection<Car> result = getSession().createQuery("FROM Car").list();
		getSession().getTransaction().commit();
		return result;
	}
	public Collection<User> readUsers() {
		getSession().beginTransaction();
		Collection<User> result = getSession().createQuery("FROM User").list();
		getSession().getTransaction().commit();
		return result;
	}
	public Collection<String> readLoginFromUsers() {
		getSession().beginTransaction();
		Collection<String> result = getSession().createQuery("Select t.login FROM User t WHERE t.role = 1").list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public Collection<Admin> readAdmins() {
		getSession().beginTransaction();
		Collection<Admin> result = getSession().createQuery("FROM Admin").list();
		getSession().getTransaction().commit();
		return result;
	}
	public Collection<Order> readOrders() {
		getSession().beginTransaction();
		Collection<Order> result = getSession().createQuery("FROM Order o WHERE (o.istake = 0 or o.istake = 1 or o.istake = 2)" ).list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public Collection<Order> readNewOrders() {
		getSession().beginTransaction();
		Collection<Order> result = getSession().createQuery("FROM Order o WHERE o.istake = 0" ).list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public Collection<Order> readRefuseOrders() {
		getSession().beginTransaction();
		Collection<Order> result = getSession().createQuery("FROM Order o WHERE o.istake = 2" ).list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public Collection<Order> readConfirmOrders() {
		getSession().beginTransaction();
		Collection<Order> result = getSession().createQuery("FROM Order o WHERE o.istake = 1" ).list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public void updateCar(Car car) {
		getSession().beginTransaction();
		getSession().update(car);
		getSession().getTransaction().commit();
	}
	
	public void delCar(Car car) {
		getSession().beginTransaction();
		getSession().delete(car);
		getSession().getTransaction().commit();
	}
	
	public void delOrder(Order order) {
		getSession().beginTransaction();
		getSession().delete(order);
		getSession().getTransaction().commit();
	}
	
	public void updateUser(User user) {
		getSession().beginTransaction();
		getSession().update(user);
		getSession().getTransaction().commit();
	}
	
	public void delUser(User user) {
		getSession().beginTransaction();
		getSession().delete(user);
		getSession().getTransaction().commit();
	}
	
	public User getUser(String name) {
		Collection<User> t = readUsers();
		for (User tt : t) {
			if (tt.getName().equals(name)) {
				return tt;
			}
		}
		return null;
	}
	public Car getCar(Long id) {
		Collection<Car> c = readCars();
		for (Car cc : c) {
			System.out.println("getId()="+cc.getId()+" id="+id);
			if ((long) cc.getId() == (long) id) {
				cc.setHavingg(false);
				return cc;
			}
		}
		return null;
	}
	
	/*public Car getCarOnId(Long id) {
		Collection<Car> c = readCars();
		for (Car cc : c) {
			System.out.println("getId()="+cc.getId()+" id="+id);
			if ((long) cc.getId() == (long) id && !(cc.isHavingg()== false)) {
				return cc;
			}
		}
		return null;
	}*/
	public Collection<Order> readOrderOnId(Long oid) {
		getSession().beginTransaction();
		Query q = getSession().createQuery("FROM Order o WHERE o.id=:oid ");
		q.setParameter("oid",oid);
		Collection<Order> result = (Collection<Order>) q.list();
		getSession().getTransaction().commit();
		return result;
	}
	
	public Collection<Car> readCarOnId(Long cid) {
		getSession().beginTransaction();
		Query q = getSession().createQuery("FROM Car c WHERE c.id=:cid ");
		q.setParameter("cid",cid);
		Collection<Car> result = (Collection<Car>) q.list();
		getSession().getTransaction().commit();
		return result;
	}
	
}
