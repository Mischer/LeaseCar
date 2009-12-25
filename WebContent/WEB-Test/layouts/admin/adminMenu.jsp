<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<br>
Курсы
<br>
<li><a href='<s:url action="OpenCourseAction"/>'>Открыть новый курс</a></li>
&nbsp;<a href="<s:url action="ListOfMyOpenCourseAction"/>">Открытые мною курсы</a><br>
&nbsp;<a href=<s:url action="ListOfOpenCourseAction"/>>Все открытые курсы</a><br>
&nbsp;<a href=<s:url action="ListOfClosedCourseAction"/>>Все закрытые курсы</a><br>
&nbsp;<a href=<s:url action="DeleteOfClosedCourseAction"/>>Удалить все закрытые курсы</a><br>
<br>
Студенты
<br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Записанные на курс</a><br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Проходящие курс</a><br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Закончившие курс</a><br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Оценить студента</a><br>
<br>
Архив оценок
<br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Оценки по курсу</a><br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Оценки студента</a><br>
&nbsp;<a href=<s:url action="OpenCourseAction"/>>Статистика курса</a><br>
<br>
