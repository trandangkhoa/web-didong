<%--
  Created by IntelliJ IDEA.
  User: khoa
  Date: 5/18/2014
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="../include.jsp"%>
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="messages\product_form" var='msg' />

<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css"
	href=".././resources/css/style.css"></link>
</head>
<body>
	<div id="productTypeDiv"  ng-app='productApp' ng-controller='ProductController'>

		<form method="post" ng-submit="createProductType()">

			<%-- <table>
				<tr>
					<td><span><fmt:message key="lbl.productname.text"
								bundle="${msg}"></fmt:message></span></td>
					<td><form:input path="productTypeName"></form:input></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
			</table>

			<button type="submit" value="Add" id="addProductTypeBtn"></button> --%>
			
			<div>
				<table>
					<tr>
						<td>Product id:</td>
						<td><input type="text-box" ng-model='productType.productTypeId'
							ng-trim='true' /></td>
					</tr>
					<tr>
						<td>Product name:</td>
						<td><input type="text-box" ng-model='productType.productTypeName'
							ng-trim='true' /></td>
					</tr>
					<tr>
						<td>Memory:</td>
						<td><input type="text-box" /></td>
					</tr>
					<tr>
						<td>Internal storage:</td>
						<td><input type="text-box" /></td>
					</tr>
				</table>

				<button type="submit" id='addProductBtn'>Add</button>
			</div>

		</form>
	</div>
	<script type="text/javascript"
		src='.././resources/script/framework/angular1.2.16.js'></script>
	<script type="text/javascript" src='.././resources/script/Models.js'></script>
	<script type="text/javascript"
		src='.././resources/script/app/productApp.js'></script>
	<script type="text/javascript"
		src='.././resources/script/controllers/ProductController.js'></script>
</body>
</html>
