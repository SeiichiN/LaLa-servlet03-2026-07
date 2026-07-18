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
	<h2>アカウント確認・編集</h2>
	<p><c:out value="${userId}" />さん: ログイン中</p>
	
	<form action="UpdateItemServlet" method="post">
		<table border="0">
			<tr>
				<th>ユーザーID</th>
				<td><c:out value="${account.userId}" /></td>
			</tr>
			<tr>
				<th><labeL><input type="radio" name="item" value="pass">パスワード</labeL></th>
				<td>******</td>
			</tr>
			<tr>
				<th><labeL><input type="radio" name="item" value="mail">メール</labeL></th>
				<td><c:out value="${account.mail}" /></td>
			</tr>
			<tr>
				<th><labeL><input type="radio" name="item" value="name">名前</labeL></th>
				<td><c:out value="${account.name}" /></td>
			</tr>
			<tr>
				<th><labeL><input type="radio" name="item" value="age">年齢</labeL></th>
				<td><c:out value="${account.age}" /></td>
			</tr>
		</table>
		<input type="submit" value="編集">
		<button type="button" onclick="location.href='MainServlet'">メインにもどる</button>
	</form>
</body>
</html>