<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1>Список зарегестрированных пользователей</h1>

<s:form action="DelUser">

<s:select name="user" list="users" size="12"/> 

<s:submit value="Удалить выбранного пользователя"/>
<s:reset value="Reset"/>

</s:form>

