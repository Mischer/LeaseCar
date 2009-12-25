<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<p align="center">

<s:form action="Login"> 
  <s:textfield label="Логин" name="username"/>
  <s:password label="Пароль" name="password" />
  <s:submit value = "Войти"/>
</s:form>

</p>

