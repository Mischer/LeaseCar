<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<br>
Общие действия :
<br>
<li><a href='<s:url action="WiewHavingCar"/>'>Посмотреть Авто</a></li>
<li><a href='<s:url action="ViewCarList"/>'>Посмотреть все Авто</a></li>
<li>&nbsp;<a href="<s:url action="ViewUser"/>">Посмотреть зарегестрированных пользователей</a><br></li>
<li>&nbsp;<a href=<s:url action="LoadFormForAddAuto"/>>Добавить Авто</a><br></li>
<li>&nbsp;<a href=<s:url action="LoadFormForAddUser"/>>Добавить пользователя</a><br></li>
<br>
Заказы :
<br>
<li>&nbsp;<a href=<s:url action="ViewOrder"/>>Поданые заказы</a><br></li>
<!--<li>&nbsp;<a href=<s:url action="OpenCourseAction"/>>Отменить заказ</a><br></li>-->

<br>

Архив :
<br>
<li>&nbsp;<a href=<s:url action="ViewAllOrder"/>>Все заказы</a><br></li>
<li>&nbsp;<a href=<s:url action="ViewRefuseOrder"/>>Отменнёные заказы</a><br></li>
<li>&nbsp;<a href=<s:url action="ViewConfirmOrder"/>>Подтвержденные  заказы</a><br></li>

<br>
