<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
	<h2>ユーザー登録</h2>
	<form action="CreateAccountServlet" method="post">
		ユーザーID：<input type="text" name="userId"><br>
		パスワード：<input type="password" name="pass"><br>
		メール：<input type="email" name="mail"><br>
		名前：<input type="text" name="name"><br>
		年齢：<input type="text" name="age"><br>
		<a href="WelcomeServlet"><button type="button">トップへ</button></a>
		<input type="submit" value="確認">
	</form>
</body>
</html>