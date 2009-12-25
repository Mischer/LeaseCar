<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1>Список доступных автомобилей</h1>

<s:select name="car" list="cars" size="10"/>

<s:form action="DelAuto">
<s:submit value = "Удалить неимещиеся авто"/>
<s:reset value ="Reset"/>
</s:form>


