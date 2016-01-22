<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
</head>
<body>
 	<spring:message var="name" code="user.name" />
	<spring:message var="age" code="user.age" />
	<spring:message var="success" code="user.success" />
	<spring:message var="submit" code="user.submit" />
<h1>
	Hello world!  
</h1>
<h2>
welcome.springmvc : <spring:message code="welcome.springmvc" text="default text" />
</h2>
<br>
<h4>śźćół asdf asdf </h4>
<hr>
<p>  The time on the server is ${serverTime}. </p>
<p><spring:message code="user.title" /></p>
<p> "${name}"</p>
<p> ${age}</p>
<p> ${success}</p>
<p> ${submit}</p>
<p><spring:message code="welcome.springmvc" /></p>
<hr>
 
    <!-- YOUR CODE HERE -->
 
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
</body>
</html>
