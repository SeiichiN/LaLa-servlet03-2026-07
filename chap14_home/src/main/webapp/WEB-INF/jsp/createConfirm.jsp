<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>新規アカウント確認</h2>
	<p>ユーザーID:<c:out value="${account.userId}" /></p>
	<p>パスワード:<c:out value="${account.pass}" /></p>
	<p>メールアドレス:<c:out value="${account.mail}" /></p>
	<p>名前:<c:out value="${account.name}" /></p>
	<p>年齢:<c:out value="${account.age}" /></p>
	<form action="CreateDoneServlet" method="post">
		<input type="hidden" name="userId" value="<c:out value="${account.userId}" />">
		<input type="hidden" name="pass" value="<c:out value="${account.pass}" />">
		<input type="hidden" name="mail" value="<c:out value="${account.mail}" />">
		<input type="hidden" name="name" value="<c:out value="${account.name}" />">
		<input type="hidden" name="age" value="<c:out value="${account.age}" />">
		<input type="submit" value="登録">
	</form>
</body>
</html>