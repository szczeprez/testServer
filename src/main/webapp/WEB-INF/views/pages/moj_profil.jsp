<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Mój profil</title>
</head>
<body>
	<p>wojewodztwo:</p>

  
<%-- <form:select path="provinn" action="changeSelect" method="POST">
		<form:option value="" label="...." />
		<form:options items="${provinn}" itemValue="id" itemLabel="name" />
</form:select>   --%>

 <form:select path="provinn">
	<form:options items="${provinn}" itemValue="id" itemLabel="name"/>
 </form:select>




	<%-- 	
DOBRZE SIĘ WYŚWITTLA
<form:select path="wojewodztwo" >
		<form:option value="" label="...." />
		<form:options items="${wojewodztwo}" itemValue="value"
			itemLabel="desctription" var="wojeee" />
		<form:errors path="wojo" cssClass="error" />
	<c:url value="/person/edit.htm"/>?id=${wojeee.value}</form:select>

	<form:select path="citys" 
		items="${citys}" 
		itemValue="value"
		itemLabel="desctription">

	</form:select> --%>


</body>
</html>
