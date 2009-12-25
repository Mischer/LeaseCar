<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="" theme="simple">

<table border="1">
	<s:iterator value="crd">
	<tr><td>
		<input type="checkbox" name="carList" 
			value='<s:property value="id"/>'/>
		</td><td> 
		
		<s:property value="car.id"/></td><td>
		<s:property value="car.name"/></td>
		</tr>
		
	</s:iterator>
	</table>

  	<s:submit/> 
  	<s:reset/>
</s:form>