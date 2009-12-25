<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	for (int i = 0; i < 5; i++) {
		User man = new User();
		man.setName("USER #" + (int) (Math.random() * 100 + 1));
		man.setLogin("Log"+ (int) (Math.random() * 100 + 1));
		man.setPassword("Pass"+ (int) (Math.random() * 100 + 1));
		man.setPatronymic("U.");
		man.setSurname("H.");
		man.setRole(2);
		man.setAge(18);
		man.setPassportdata("uuuuuuuuuuuuuu");
		Config.getDAO().addUser(man);
	}
for (int i = 0; i < 2; i++) {
	Admin man = new Admin();
	man.setName("Admin #" + i);
	man.setLogin("Log #"+ (int) (Math.random() * 100 + 1));
	man.setPassword("Pass #"+ (int) (Math.random() * 100 + 1));
	man.setSurname("H.");
	man.setPatronymic("U.");
	man.setRole(1);
	Config.getDAO().addAdmin(man);
}
	for (int i = 0; i < 2; i++) {
		Car car = new Car();
		car.setName("Ford" + (int) (Math.random() * 100 + 1));
		car.setDescription("#"+ (int) (Math.random() * 100 + 1));
		car.setPrice((int) (Math.random() * 100 + 1));
		car.setHavingg(false);
		Config.getDAO().addCar(car);
	}
	
	Car car1 = new Car();
	car1.setName("Audi");
	car1.setDescription("A6");
	car1.setPrice((int)56);
	car1.setHavingg(true);
	Config.getDAO().addCar(car1);
	
} catch (Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>