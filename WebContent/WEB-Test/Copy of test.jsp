<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="com.epam.leasecar.config.Config"%>
<%@page import="com.epam.leasecar.dao.HibernateDAO"%>
<%@page import="com.epam.leasecar.model.Man"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try {
	System.out.println(" === Go ===");
	
 //Config.getDAO().createBD(); 	
} catch (Exception e) {
	e.printStackTrace();
}
%>

</body>
</html>