<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="OrderToArchive" theme="simple">

<table border="1">
<tr>
<td>&nbsp;</td>
<td>Дата</td>
<td>Срок</td>
<td>Имя</td>
<td>Фамилия</td>
<td>Отчество</td>
<td>Возраст</td>
<td>Поспорт</td>
<td>Авто</td>
<td>Цена</td>
</tr>
	<s:iterator value="ord">
	<tr><td>
		<input type="checkbox" name="demandOrder" 
			value='<s:property value="id"/>'/>
		</td><td width="60"> 
		<s:property value="data"/></td><td>
		<s:property value="days"/></td><td>
		
		<s:property value="user.name"/></td><td>
		<s:property value="user.surname"/></td>
		<td>
		<s:property value="user.patronymic"/></td>
		<td>
		<s:property value="user.age"/></td>
		<td>
		<s:property value="user.passportdata"/></td>
		<td>
		<s:property value="car.name"/></td>
		<td>
		<s:property value="car.price"/></td>
		</tr>
		
	</s:iterator>
	</table>

  	<s:submit value = "Принять помеченные заказы" action = "OrderToArchive" /> 
  	<s:submit value = "Отвергнуть помеченные заказы" action = "OrderToArchive1" />
  	<s:reset/>
</s:form>