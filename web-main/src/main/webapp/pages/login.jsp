<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp"%>

<html>
<head>
<title>Login page</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='../resources/css/style.css' />"></link>
</head>

<body>
	<div id="loginbox">
		<table>
			<tr>
				<td><span>Username:</span></td>
				<td><input id="txtUsername" class="login" /></td>
			</tr>
			<tr style="height: 5px"></tr>
			<tr>
				<td><span>Password:</span></td>
				<td><input type="password" id="txtPassword" class="login" /></td>
			</tr>
		</table>
	</div>
</body>
</html>