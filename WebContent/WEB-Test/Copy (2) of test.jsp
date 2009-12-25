<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="com.epam.leasecar.config.Config"%>
<%@page import="com.epam.leasecar.dao.HibernateDAO"%>
<%@page import="com.epam.leasecar.model.Man"%>
<%@page import="com.epam.leasecar.model.User"%>
<%@page import="com.epam.leasecar.model.Admin"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try {
	System.out.println(" === Go ===");
	Man man1 = new Man();
	man1.setName("Mischer");
	man1.setLogin("abc");
	Config.getDAO().addMan(man1);
 
	Man man2 = new Man();
	man2.setName("Andrey");
	man2.setLogin("abc");
	Config.getDAO().addMan(man2);

	User user1 = new User();
	man2.setName("ndrey");
	man2.setLogin("abc");
	Config.getDAO().addUser(user1);

	Admin admin1 = new Admin();
	man2.setName("drey");
	man2.setLogin("abc");
	Config.getDAO().addAdmin(admin1);


} catch (Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>