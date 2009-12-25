<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="AddAuto"> 
  
  <s:textfield label="NameAuto" name="name" />
  <s:textfield label="DescriptionAuto" name="description" />
  <s:textfield label="PriceAuto" name="price" />
  <s:textfield label="Having" name="havingg" />
  
  <s:submit value = "AddAuto"/>

</s:form>