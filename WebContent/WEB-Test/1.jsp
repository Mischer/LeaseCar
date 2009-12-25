<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1>Список доступных авто</h1>

<a href="<s:url action="AddAuto"/>">AddAuto</a>
<a href="<s:url action="AddUser"/>">AddUser</a>

<s:form action="WiewHavingCar">
<s:submit value="Дальше"/>
<s:reset value="Reset"/>

</s:form>

<h1>Список зарегестрированных пользователей</h1>

<s:form action="ViewUser">

<s:submit value="Показать "/>
<s:reset value="Reset"/>

</s:form>
