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
		<input type="submit" value="登録">
		<input type="submit" 
		    formaction="CreateAccountServlet" 
		    value="訂正" formmethod="get">
	</form>
</body>
</html>