<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="RegistrationUser"> 

  <s:textfield label="Фамилия" name="surname"/>
  <s:textfield label="Имя" name="name" />
  <s:textfield label="Отчество" name="patronymic" />
  <h1>Извините, данный логин уже используется другим пользователем</h1><br>
  <h1>Введите данные заново используя другой логин </h1>
  <s:textfield label="Логин" name="login" />
  <s:textfield label="Пароль" name="password" />
  <s:textfield label="Возраст" name="age" />
  <s:textfield label="Серия и номер паспорта" name="passportdata" />
  
  <s:submit value = "Зарегестрироваться"/>

</s:form>