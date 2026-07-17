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
	<c:if test="${not empty errors}">
		<c:forEach var="error" items="${errors}">
			<p style="color:red;">
				<c:out value="${error}" />
			</p>
		</c:forEach>
	</c:if>
	<form action="CreateAccountServlet" method="post">
		ユーザーID：<input type="text" name="userId" value="<c:out value="${account.userId}" />"><br>
		パスワード：<input type="password" name="pass"><br>
		メール：<input type="email" name="mail" value="<c:out value="${account.mail}" />"><br>
		名前：<input type="text" name="name" value="<c:out value="${account.name}" />"><br>
		年齢：<input type="text" name="age" value="<c:out value="${account.age}" />"><br>
		<button type="button"
		        onclick="location.href='ReturnTopServlet'">トップへ</button>
		<input type="submit" value="確認">
	</form>
</body>
</html>