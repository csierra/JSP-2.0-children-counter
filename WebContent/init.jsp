<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="bizonos" tagdir="/WEB-INF/tags/bizonos" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title</title>
</head>
<body>
	<h1>Hello World!</h1>
	<bizonos:panel-container>
		<bizonos:panel>a</bizonos:panel>
		<bizonos:panel>b</bizonos:panel>
		<bizonos:panel>c</bizonos:panel>
		<bizonos:panel>
			<bizonos:panel-container>
				<bizonos:panel>1</bizonos:panel>
				<bizonos:panel>2</bizonos:panel>
			</bizonos:panel-container>
		</bizonos:panel>
		<bizonos:panel>d</bizonos:panel>
		<bizonos:panel>e</bizonos:panel>
		<bizonos:panel>
			<bizonos:panel-container>
				<bizonos:panel>x</bizonos:panel>
				<bizonos:panel>y</bizonos:panel>
				<bizonos:panel>z</bizonos:panel>
			</bizonos:panel-container>
		</bizonos:panel>
	</bizonos:panel-container>
	
</body>
</html>