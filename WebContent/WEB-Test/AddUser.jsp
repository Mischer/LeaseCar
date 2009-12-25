<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="AddUser"> 
  
  <s:textfield label="Name" name="name" />
  <s:textfield label="Surname" name="surname" />
  <s:textfield label="Patronymic" name="patronymic" />
  <s:textfield label="Login" name="login" />
  <s:textfield label="Password" name="password" />
  <s:textfield label="Age" name="age" />
  <s:textfield label="Role" name="role" />
  
  <s:submit value = "AddUser"/>

</s:form>