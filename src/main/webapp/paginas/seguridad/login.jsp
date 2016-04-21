<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spring:url value="demokendo/loginWeb/principal" var="autenticarUsuarioUrl" />

	<button type="button" onclick="location.href='${autenticarUsuarioUrl}'"
		class="width-35 pull-right btn btn-sm btn-primary">
		<i class="icon-key"></i> Login
	</button>
</body>
</html>