<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="OrderToArchive" theme="simple">

<table border="1">
	<s:iterator value="ord">
	<tr><td>
		<!-- <input type="checkbox" name="demandOrder" 
			value='<s:property value="id"/>'/>-->
		</td><td> 
		<s:property value="data"/></td><td>
		<s:property value="days"/></td><td>
		
		<s:property value="user.id"/></td><td>
		<s:property value="user.name"/></td><td>
		<s:property value="user.age"/></td><td>
		<s:property value="user.passportdata"/></td><td>
		
		<s:property value="car.id"/></td><td>
		<s:property value="car.name"/></td>
		</tr>
		
	</s:iterator>
	</table>

  	<s:submit value = "Принять помеченные заказы"/> 
  	<s:reset/>
</s:form>