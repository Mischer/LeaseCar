<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1>Список доступных автомобилей</h1>
<s:form action="DoOrder">
<s:textfield label="Дата заказа" name="data" />
<s:textfield label="Количество дней" name="days" />
<s:select name="car" list="cars" size="10"/>
<s:submit value = "Заказать выбранное авто"/>
<s:reset value ="Reset"/>
</s:form>


