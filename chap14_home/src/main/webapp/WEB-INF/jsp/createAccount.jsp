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
	<h1>新規アカウント登録</h1>
	<form action="CreateAccountServlet" method="post">
		<p>
			ユーザーID:<input type="text" name="userId"
				value="<c:out value="${userId}" />">
		</p>
		<p>
			パスワード:<input type="password" name="pass"
				value="<c:out value="${pass}" />">
		</p>
		<p>
			メールアドレス:<input type="email" name="mail"
				value="<c:out value="${mail}" />">
		</p>
		<p>
			名前:<input type="text" name="name"
				value="<c:out value="${name}" />">
		</p>
		<p>
			年齢:<input type="text" name="age"
				value="<c:out value="${age}" />">
		</p>
		<p>
			<input type="submit" value="確認">
			<input type="submit" value="もどる"
				formaction="WelcomeServlet" 
				formmethod="get">
		</p>
	</form>
</body>
</html>