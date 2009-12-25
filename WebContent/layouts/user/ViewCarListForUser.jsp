<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<h1 align="center">Список Автомобилей</h1><br><!--theme="simple"-->
<s:form action="" >
<table border="1" width="90%" align="center" style="text-align:center">
    <tr>
    	
        <th>Id</th>
        <th>Название</th>
        <th>Описание</th>
        <th>Цена($ за сутки)</th>
        <th>Наличие</th>
    </tr> 
    <s:iterator value="carlist"> 
        <tr>
            <td><s:property value="%{id}"/></td>
            <td><s:property value="%{name}"/></td>
            <td><s:property value="%{description}"/></td>
            <td><s:property value="%{price}"/></td>
            <td><s:property value="%{havingg}"/></td>
        	</tr>
    </s:iterator>
</table>
</s:form>