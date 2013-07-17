<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="liferay" tagdir="/WEB-INF/tags/liferay" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title</title>
</head>
<body>
	<h1>Hola mundo</h1>
	<liferay:panel-container>
		<liferay:panel>a</liferay:panel>
		<liferay:panel>b</liferay:panel>
		<liferay:panel>c</liferay:panel>
		<liferay:panel>
			<liferay:panel-container>
				<liferay:panel>1</liferay:panel>
				<liferay:panel>2</liferay:panel>
			</liferay:panel-container>
		</liferay:panel>
		<liferay:panel>d</liferay:panel>
		<liferay:panel>e</liferay:panel>
		<liferay:panel>
			<liferay:panel-container>
				<liferay:panel>x</liferay:panel>
				<liferay:panel>y</liferay:panel>
				<liferay:panel>z</liferay:panel>
			</liferay:panel-container>
		</liferay:panel>
	</liferay:panel-container>
	
	<h2>salida <span> ${salida} ${salida2}</span></h2>
</body>
</html>