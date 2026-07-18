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
	<h2>アカウント項目<c:out value="${item}" />の編集</h2>
	<table border="0">
		<tr>
			<th>修正前</th>
			<td>
			<c:choose>
				<c:when test="${item == 'pass'}">******</c:when>
				<c:when test="${item == 'mail'}"><c:out value="${account.mail}" /></c:when>
				<c:when test="${item == 'name'}"><c:out value="${account.name}" /></c:when>
				<c:when test="${item == 'age'}"><c:out value="${account.age}" /></c:when>
			</c:choose>
			</td>
		</tr>
		<tr>
			<th>修正</th>
			<td>
				<form action="UpdateItemDoneServlet" method="POST">
					<c:choose>
						<c:when test="${item == 'pass'}">
							<input type="password" name="${item}">
						</c:when>
						<c:when test="${item == 'mail'}">
							<input type="email" name="${item}">
						</c:when>
						<c:otherwise>
							<input type="text" name="${item}">
						</c:otherwise>
					</c:choose>
					<input type="submit" value="変更">
				</form>
			</td>
		</tr>
	</table>
	<button type="button" onclick="location.href='UpdateAccountServlet'">ひとつ前に戻る</button>
</body>
</html>