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
	<c:if test="${not empty errors}">
		<c:forEach var="error" items="${errors}">
			<p style="color: red"><c:out value="${error}" /></p>
		</c:forEach>
	</c:if>
	<form action="CreateAccountServlet" method="post">
		<p>
			ユーザーID:<input type="text" name="userId"
				value="<c:out value="${account.userId}" />">
		</p>
		<p>
			パスワード:<input type="password" name="pass"
				value="<c:out value="${account.pass}" />">
		</p>
		<p>
			メールアドレス:<input type="email" name="mail"
				value="<c:out value="${account.mail}" />">
		</p>
		<p>
			名前:<input type="text" name="name"
				value="<c:out value="${account.name}" />">
		</p>
		<p>
			年齢:<input type="text" name="age"
				value="<c:out value="${account.age}" />">
		</p>
		<p>
			<input type="submit" value="確認">
			<a href="ReturnTopServlet">
				<button type="button" >トップへ</button>
			</a>
		</p>
	</form>
</body>
</html>