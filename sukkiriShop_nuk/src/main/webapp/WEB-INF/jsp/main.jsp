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
	<p>ようこそ <c:out value="${userId}" /> さん</p>
	<p>
		<a href="UpdateAccountServlet">アカウント確認・編集</a>
	</p>
	<p>
		<a href="ReturnTopServlet">トップへ(ログアウト)</a>
	</p>
</body>
</html>