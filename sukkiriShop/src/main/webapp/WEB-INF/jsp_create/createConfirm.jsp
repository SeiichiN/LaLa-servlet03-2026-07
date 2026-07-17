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
	<h2>ユーザー登録・確認</h2>
	<p>ユーザーID:<c:out value="${account.userId}" /></p>
	<p>パスワード:<c:out value="${account.pass}" /></p>
	<p>メール:<c:out value="${account.mail}" /></p>
	<p>名前:<c:out value="${account.name}" /></p>
	<p>年齢:<c:out value="${account.age}" /></p>
	<button type="button" 
	        onclick="location.href='CreateAccountServlet'">入力にもどる</button>
	<button type="button" 
	        onclick="location.href='CreateDoneServlet'">登録</button>

</body>
</html>