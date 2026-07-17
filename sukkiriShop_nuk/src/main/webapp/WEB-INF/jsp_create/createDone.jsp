<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
	<h2>ユーザー登録</h2>
	<c:if test="${not empty msg}">
	  <p><c:out value="${msg}" /></p>
	</c:if>
	<a href="WelcomeServlet">トップへ</a>
</body>
</html>