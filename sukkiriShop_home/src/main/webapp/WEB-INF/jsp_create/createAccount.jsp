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
	<form action="CreateAccountServlet" method="post">
		ユーザーID：<input type="text" name="userId"
			           value="<c:out value="${account.userId}" />"><br>
		パスワード：<input type="password" name="pass"
		             value="<c:out value="${account.pass}" />"><br>
		メール：<input type="email" name="mail"
		             value="<c:out value="${account.mail}" />"><br>
		名前：<input type="text" name="name"
		             value="<c:out value="${account.name}" />"><br>
		年齢：<input type="text" name="age"
		             value="<c:out value="${account.age}" />"><br>
		<%-- 
		セッションにAccountが残っているかもしれないので
		ReturnTopServletでセッションのAccountを削除してから
		トップに戻る 
		--%>
		<button type="button"
		        onclick="location.href='ReturnTopServlet'">トップへ</button>
		<input type="submit" value="確認">
	</form>
</body>
</html>