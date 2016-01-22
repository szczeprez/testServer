<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Strony internetowe, sklepy internetowe, social media, nbsmedia.pl</title>

    <!-- Bootstrap core CSS -->
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
  
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
   <div class="container">
   	<!-- included MENU -->
	<jsp:include page="${request.contextPath}/menu" />
	<h3 class="text-muted"> <a href="/testserver/"><img src="<c:url value="/resources/pic/Nbsmedia_logo.png" />" alt="logo Nbsmedia.pl" title="Nbsmedia"/></a></h3>
	
    <div class="jumbotron">
        <h1><spring:message code="nbsmedia.zaprasza" /></h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
        <p><a class="btn btn-lg btn-success" href="#" role="button">Sklepy internetowe</a></p>
        <p><a class="btn btn-lg btn-success" href="#" role="button">Nasze realizacje</a></p>
    </div>
     	<!-- included content -->
	<jsp:include page="${request.contextPath}/content" />

     

   	<!-- included footer -->
	<jsp:include page="${request.contextPath}/footer" />

    </div> <!-- /container -->
 
    <!-- YOUR CODE HERE -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>
