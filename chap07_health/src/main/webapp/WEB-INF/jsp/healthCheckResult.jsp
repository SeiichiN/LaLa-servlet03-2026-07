<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
	<h1>スッキリ健康診断</h1>
	
	<c:if test="${not empty msg}">
	  <p><c:out value="${msg}" /></p>
	</c:if>
	
	<p>
	身長：<c:out value="${health.height}" />(cm)<br>
	体重：<c:out value="${health.weight}" />(kg)<br>
	BMI： <c:out value="${health.bmi}" /><br>
	体型：<c:out value="${health.bodyType}" />
	</p>
	<a href="HealthCheck">もどる</a>
</body>
</html>