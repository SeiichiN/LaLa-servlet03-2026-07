<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
	<p>ようこそ <c:out value="${sessionScope.userId}"/> さん</p>
	<a href="WelcomeServlet">トップへ</a>
</body>
</html>