<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="../include.jsp"%>
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="messages\product_type_list" var='msg'/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="${language}">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="title"  bundle="${msg}"></fmt:message></title>
</head>
<body>
	<h1>
		<fmt:message key="h1.text"  bundle="${msg}"></fmt:message>
	</h1>
	<h2>
		<fmt:message key="h2.text"  bundle="${msg}"></fmt:message>
	</h2>
	<br />

	<c:forEach items='${model}' var='productType'>

		<span>${productType.productTypeId}</span>
		<i><c:out value="${productType.productTypeName}"></c:out> </i>
		<br />
		<br />

	</c:forEach>
</body>
</html>