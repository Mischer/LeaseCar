<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="com.epam.leasecar.config.Config"%>
<%@page import="com.epam.leasecar.dao.HibernateDAO"%>
<%@page import="com.epam.leasecar.model.Man"%>
<%@page import="com.epam.leasecar.model.User"%>
<%@page import="com.epam.leasecar.model.Admin"%>
<%@page import="com.epam.leasecar.model.Car"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try {
	System.out.println(" === Go ===");
/*	
	for (int i = 0; i < 5; i++) {
		Man man = new Man();
		man.setName("USER #" + (int) (Math.random() * 100 + 1));
		man.setLogin("Log #"+ (int) (Math.random() * 100 + 1));
		man.setPassword("Pass #"+ (int) (Math.random() * 100 + 1));
		man.setPatronymic("U.");
		man.setSurname("H.");
		man.setRole(2);
		Config.getDAO().addMan(man);
	}
*/
	
		User man = new User();
		man.setName("Михаил");
		man.setLogin("1");
		man.setPassword("1");
		man.setPatronymic("Игоревич");
		man.setSurname("Культиясов");
		man.setRole(2);
		man.setAge(22);
		man.setPassportdata("КН1561922");
		Config.getDAO().addUser(man);


		User user = new User();
		user.setName("Андрей");
		user.setLogin("2");
		user.setPassword("2");
		user.setPatronymic("Петрович");
		user.setSurname("Иванов");
		user.setRole(2);
		user.setAge(28);
		user.setPassportdata("КН1543212");
		Config.getDAO().addUser(user);
		
		User user1 = new User();
		user1.setName("Иван");
		user1.setLogin("3");
		user1.setPassword("3");
		user1.setPatronymic("Петрович");
		user1.setSurname("Сильванович");
		user1.setRole(2);
		user1.setAge(28);
		user1.setPassportdata("КН1556578");
		Config.getDAO().addUser(user1);
		
	Admin admin = new Admin();
	admin.setName("Михаил");
	admin.setLogin("Mischer");
	admin.setPassword("Fischer");
	admin.setSurname("Культиясов");
	admin.setPatronymic("Игоревич");
	admin.setRole(1);
	Config.getDAO().addAdmin(admin);

/*	for (int i = 0; i < 2; i++) {
		Car car = new Car();
		car.setName("Ford" + (int) (Math.random() * 100 + 1));
		car.setDescription("#"+ (int) (Math.random() * 100 + 1));
		car.setPrice((int) (Math.random() * 100 + 1));
		car.setHavingg(false);
		Config.getDAO().addCar(car);
	} */
	
	Car car1 = new Car();
	car1.setName("Audi");
	car1.setDescription("A6");
	car1.setPrice((int)56);
	car1.setHavingg(true);
	Config.getDAO().addCar(car1);
	
	Car car2 = new Car();
	car2.setName("Toyota");
	car2.setDescription("Camry");
	car2.setPrice((int)100);
	car2.setHavingg(true);
	Config.getDAO().addCar(car2);
	
	Car car3 = new Car();
	car3.setName("BMW");
	car3.setDescription("X5");
	car3.setPrice((int)150);
	car3.setHavingg(true);
	Config.getDAO().addCar(car3);
	
	Car car4 = new Car();
	car4.setName("Ford");
	car4.setDescription("Mustang");
	car4.setPrice((int)170);
	car4.setHavingg(true);
	Config.getDAO().addCar(car4);
	
	Car car5 = new Car();
	car5.setName("Opel");
	car5.setDescription("Astra");
	car5.setPrice((int)50);
	car5.setHavingg(true);
	Config.getDAO().addCar(car5);
	
	
} catch (Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>